package cn.wangzg.mdwidget.tech;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;

import cn.wangzg.mdwidget.R;
import cn.wangzg.mdwidget.Utils.CommonAdapter;
import cn.wangzg.mdwidget.Utils.HttpUtil;
import cn.wangzg.mdwidget.Utils.ViewHolder;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TechFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TechFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TechFragment extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_TYPE = "type";
//    private static final String ARG_PARAM2 = "param2";

    private String mType;
//    private String mParam2;
    private CommonAdapter<TechBean.ResultsBean> adapter = null;
    private ArrayList<TechBean.ResultsBean> datas = null;
//    private OnFragmentInteractionListener mListener;

    public TechFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param type Parameter 1.
     * @return A new instance of fragment TechFragment.
     */
    public static TechFragment newInstance(String type) {
        TechFragment fragment = new TechFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mType = getArguments().getString(ARG_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tech, container, false);
        ListView listView = view.findViewById(R.id.mylist);
        adapter = new CommonAdapter<TechBean.ResultsBean>(getContext(),
                datas,R.layout.today_item) {
            @Override
            public void convert(ViewHolder helper, TechBean.ResultsBean item) {
                helper.setText(R.id.tv_desc,item.getDesc());
                helper.setText(R.id.tv_who,item.getWho());
                helper.setText(R.id.tv_create,item.getCreatedAt().substring(0,10));
                if(item.getImages()==null){
                    helper.getView(R.id.imageView).setVisibility(View.GONE);
                }else {
                    helper.setImageByUrl(R.id.imageView, item.getImages().get(0));
                }
            }
        };
        listView.setAdapter(adapter);
        HttpUtil.sendOkHttpRequest(HttpUtil.getUrl(mType,10,1), new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                datas = HttpUtil.getNewsListByGson(response.body().string());
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter.addmDatas(datas);
                        adapter.notifyDataSetChanged();
                    }
                });
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }

//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }
}
