package cn.wangzg.mdwidget.tech;

import java.util.List;

/**
 * Time: 2019/3/1
 * Author: wangzhiguo
 * Description: 功能描述
 */
public class TechBean {

    /**
     * error : false
     * results : [{"_id":"5c789ee19d212233d4b3da89","createdAt":"2019-03-01T02:54:25.522Z","desc":"Android消息总线的演进之路：用LiveDataBus替代RxBus、EventBus","images":["http://img.gank.io/48d7129b-ee08-4a5d-8eb8-bd626254eeae","http://img.gank.io/85c21024-8f3b-4899-91b6-95451a0f3b07"],"publishedAt":"2019-03-01T03:13:05.882Z","source":"web","type":"Android","url":"https://tech.meituan.com/2018/07/26/android-livedatabus.html","used":true,"who":"潇湘剑雨"},{"_id":"5c74b1eb9d21223945d4dde6","createdAt":"2019-02-26T06:23:16.419Z","desc":"Android组件化开发实践和案例分享案例","images":["http://img.gank.io/b440c48f-9b77-4974-9789-1a6b7e7fa2fa"],"publishedAt":"2019-02-26T06:24:05.977Z","source":"web","type":"Android","url":"https://github.com/yangchong211/LifeHelper","used":true,"who":"fingdo"},{"_id":"5c71169c9d212251b29ad46d","createdAt":"2019-02-23T09:47:08.688Z","desc":"WaveView优雅的水波纹动画实现","images":["http://img.gank.io/9335fc17-d0c4-44cc-ace7-bcf75497b425"],"publishedAt":"2019-02-25T01:27:07.146Z","source":"web","type":"Android","url":"https://github.com/jenly1314/WaveView","used":true,"who":"fingdo"},{"_id":"5c6a49b99d2122267ad2c503","createdAt":"2019-02-18T05:59:21.90Z","desc":"一个Android App快速开发框架。","images":["http://img.gank.io/d5a61f4f-5718-475c-92ac-2bac01b437d5"],"publishedAt":"2019-02-18T06:00:33.410Z","source":"chrome","type":"Android","url":"https://github.com/ddnosh/AndroidQuick","used":true,"who":"lijinshanmx"},{"_id":"5c6924aa9d212226806fd415","createdAt":"2019-02-17T09:08:58.785Z","desc":"还在写drawable.xml？快来试试Folivora吧","images":["http://img.gank.io/1dec547e-0c46-4750-90cf-32f0aa59de65"],"publishedAt":"2019-02-18T06:00:23.871Z","source":"web","type":"Android","url":"https://github.com/Cricin/Folivora","used":true,"who":"lijinshanmx"},{"_id":"5c6a067c9d212226776d3254","createdAt":"2019-02-18T01:12:28.323Z","desc":" CircleProgressView圆形渐变的进度控件，动画效果纵享丝滑。","images":["http://img.gank.io/c5e97ecf-3847-4a98-86f1-6b24219e53b4"],"publishedAt":"2019-02-18T05:51:43.182Z","source":"web","type":"Android","url":"https://github.com/jenly1314/CircleProgressView","used":true,"who":"lijinshanmx"},{"_id":"5c64d62f9d212226776d324d","createdAt":"2019-02-14T02:45:03.987Z","desc":"针对RecyclerView高效刷新，多类型列表，异步数据更新，崩溃等各种复杂难处理场景的高性能易用的列表库","images":["http://img.gank.io/cb9796c3-22c3-4f0a-8986-63914ec88642"],"publishedAt":"2019-02-14T06:18:36.304Z","source":"web","type":"Android","url":"https://github.com/SilenceDut/diffadapter","used":true,"who":"fingdo"},{"_id":"5c0622429d2122308e7445cf","createdAt":"2018-12-04T06:44:18.364Z","desc":"一个基于ijkplayer的完整视频播放器封装，支持自定义，拓展性强，已经用于实际开发中","images":["http://img.gank.io/0cd8baa4-7d96-40fb-ab0c-4b3668a7ac4d","http://img.gank.io/35066fc9-4c67-498d-b9e1-f8e3ca7410e1","http://img.gank.io/ad8b369e-c643-4631-afdd-4466aab4f7fd","http://img.gank.io/101d45df-c66b-4610-809a-734fbca99967","http://img.gank.io/d8755a02-fe71-4562-ac9f-4d7d6b0d3358"],"publishedAt":"2019-02-13T03:26:06.640Z","source":"web","type":"Android","url":"https://github.com/yangchong211/YCVideoPlayer","used":true,"who":"fingdo"},{"_id":"5c491af39d212264d18bb279","createdAt":"2019-01-24T01:54:59.296Z","desc":"一款简单高效的滑动库，模仿MIUI滑动返回或即刻返回功能","images":["http://img.gank.io/3ac00581-11e4-4c2d-ba32-e3192d5840d0"],"publishedAt":"2019-02-13T02:44:43.299Z","source":"web","type":"Android","url":"https://github.com/dkzwm/EasySwipeLayout","used":true,"who":"lijinshanmx"},{"_id":"5c46e85d9d212264d4501d47","createdAt":"2019-02-13T02:41:46.573Z","desc":"在图片上做标签，图片可缩放。","images":["http://img.gank.io/c8aecd99-61a9-4634-aa91-1b7ab39081ab"],"publishedAt":"2019-02-13T02:41:56.484Z","source":"web","type":"Android","url":"https://github.com/lihangleo2/Imgdots","used":true,"who":"lijinshanmx"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 5c789ee19d212233d4b3da89
         * createdAt : 2019-03-01T02:54:25.522Z
         * desc : Android消息总线的演进之路：用LiveDataBus替代RxBus、EventBus
         * images : ["http://img.gank.io/48d7129b-ee08-4a5d-8eb8-bd626254eeae","http://img.gank.io/85c21024-8f3b-4899-91b6-95451a0f3b07"]
         * publishedAt : 2019-03-01T03:13:05.882Z
         * source : web
         * type : Android
         * url : https://tech.meituan.com/2018/07/26/android-livedatabus.html
         * used : true
         * who : 潇湘剑雨
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}
