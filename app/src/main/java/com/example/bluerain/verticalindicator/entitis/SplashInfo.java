package com.example.bluerain.verticalindicator.entitis;

import java.util.List;

/**
 * Created by bluerain on 17-3-5.
 */

public class SplashInfo {


    private int code;
    private String info;
    private String desc;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {


        private String Motto;
        private TabCfgBean tabCfg;
        private SplashBean splash;
        private int api_version;
        private int api_timeoutms;
        private boolean token_expire;
        private boolean use_transition;

        public String getMotto() {
            return Motto;
        }

        public void setMotto(String Motto) {
            this.Motto = Motto;
        }

        public TabCfgBean getTabCfg() {
            return tabCfg;
        }

        public void setTabCfg(TabCfgBean tabCfg) {
            this.tabCfg = tabCfg;
        }

        public SplashBean getSplash() {
            return splash;
        }

        public void setSplash(SplashBean splash) {
            this.splash = splash;
        }

        public int getApi_version() {
            return api_version;
        }

        public void setApi_version(int api_version) {
            this.api_version = api_version;
        }

        public int getApi_timeoutms() {
            return api_timeoutms;
        }

        public void setApi_timeoutms(int api_timeoutms) {
            this.api_timeoutms = api_timeoutms;
        }

        public boolean isToken_expire() {
            return token_expire;
        }

        public void setToken_expire(boolean token_expire) {
            this.token_expire = token_expire;
        }

        public boolean isUse_transition() {
            return use_transition;
        }

        public void setUse_transition(boolean use_transition) {
            this.use_transition = use_transition;
        }

        public static class TabCfgBean {
            /**
             * tab_bg : http://i1.mifile.cn/v1/a1/T1YJZgBmVT1R4cSCrK.png
             * tab_config : [{"icon_normal":"http://i8.mifile.cn/v1/a1/7a7d0ce7-3859-b188-424d-a0695f5eef0e.png","icon_selected":"http://i8.mifile.cn/v1/a1/02d4f63a-3bda-210a-5727-110fdf2e3fe1.png","name":"首页","type":"home","show":true,"text_color_normal":"#747474","text_color_selected":"#ED5B00","icon_big":false},{"icon_normal":"http://i8.mifile.cn/v1/a1/461abe53-55e2-eb46-4817-7909ecd1e2a6.png","icon_selected":"http://i8.mifile.cn/v1/a1/cc2d5c56-7b00-ec76-02c6-00aed4a08ac9.png","name":"分类","type":"category","show":true,"text_color_normal":"#747474","text_color_selected":"#ED5B00","icon_big":false},{"icon_normal":"http://i8.mifile.cn/v1/a1/152f3bf2-6218-0414-c0c6-a0adfaf4d410.png","icon_selected":"http://i8.mifile.cn/v1/a1/4d4dcd34-9b1c-c55c-bdbf-12533decd69f.png","name":"发现","type":"discovery","show":true,"text_color_normal":"#747474","text_color_selected":"#ED5B00","icon_big":true},{"icon_normal":"http://i8.mifile.cn/v1/a1/9b29cf63-a59a-8b07-36db-5fe0bc309317.png","icon_selected":"http://i8.mifile.cn/v1/a1/389a48f2-539f-4d28-e9bb-757813dc88a4.png","name":"购物车","type":"cart_main","show":true,"text_color_normal":"#747474","text_color_selected":"#ED5B00","icon_big":false},{"icon_normal":"http://i8.mifile.cn/v1/a1/835193c2-c643-1d65-e194-17da8e9d0fb9.png","icon_selected":"http://i8.mifile.cn/v1/a1/6984fc74-6273-aa75-89e0-f35e04d9e8aa.png","name":"我的","type":"mine","show":true,"text_color_normal":"#747474","text_color_selected":"#ED5B00","icon_big":false}]
             */

            private String tab_bg;
            private List<TabConfigBean> tab_config;

            public String getTab_bg() {
                return tab_bg;
            }

            public void setTab_bg(String tab_bg) {
                this.tab_bg = tab_bg;
            }

            public List<TabConfigBean> getTab_config() {
                return tab_config;
            }

            public void setTab_config(List<TabConfigBean> tab_config) {
                this.tab_config = tab_config;
            }

            public static class TabConfigBean {
                /**
                 * icon_normal : http://i8.mifile.cn/v1/a1/7a7d0ce7-3859-b188-424d-a0695f5eef0e.png
                 * icon_selected : http://i8.mifile.cn/v1/a1/02d4f63a-3bda-210a-5727-110fdf2e3fe1.png
                 * name : 首页
                 * type : home
                 * show : true
                 * text_color_normal : #747474
                 * text_color_selected : #ED5B00
                 * icon_big : false
                 */

                private String icon_normal;
                private String icon_selected;
                private String name;
                private String type;
                private boolean show;
                private String text_color_normal;
                private String text_color_selected;
                private boolean icon_big;

                public String getIcon_normal() {
                    return icon_normal;
                }

                public void setIcon_normal(String icon_normal) {
                    this.icon_normal = icon_normal;
                }

                public String getIcon_selected() {
                    return icon_selected;
                }

                public void setIcon_selected(String icon_selected) {
                    this.icon_selected = icon_selected;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public boolean isShow() {
                    return show;
                }

                public void setShow(boolean show) {
                    this.show = show;
                }

                public String getText_color_normal() {
                    return text_color_normal;
                }

                public void setText_color_normal(String text_color_normal) {
                    this.text_color_normal = text_color_normal;
                }

                public String getText_color_selected() {
                    return text_color_selected;
                }

                public void setText_color_selected(String text_color_selected) {
                    this.text_color_selected = text_color_selected;
                }

                public boolean isIcon_big() {
                    return icon_big;
                }

                public void setIcon_big(boolean icon_big) {
                    this.icon_big = icon_big;
                }
            }
        }

        public static class SplashBean {
            /**
             * ID : 48
             * ShowTimes : -1
             * start : 1488710302
             * url : http://i8.mifile.cn/v1/a1/f520c934-ef10-dd72-0eda-8b1cd0c9865c.webp
             * end : 1488710312
             * skip_hide : false
             * skip_url : http://cdn.cnbj0.fds.api.mi-img.com/b2c-mimall-media/459dc18c790e5288d8efc27d603ff5a3.png
             * duration : 5
             * jump_info : {"pluginId":"","path":"ShopPlugin://com.xiaomi.shop2.plugin.webview.RootFragment?pluginId=111","extra":{"url":"https://s1.mi.com/m/ghd/2017/xgs0301/"},"log_code":"31appsplashsplash001000#rid=ae617153ecf2e5e387358082b2ea9b55"}
             * video_info : {}
             * gif_info : {}
             */

            private String ID;
            private int ShowTimes;
            private int start;
            private String url;
            private int end;
            private boolean skip_hide;
            private String skip_url;
            private String duration;
            private JumpInfoBean jump_info;
            private VideoInfoBean video_info;
            private GifInfoBean gif_info;

            public String getID() {
                return ID;
            }

            public void setID(String ID) {
                this.ID = ID;
            }

            public int getShowTimes() {
                return ShowTimes;
            }

            public void setShowTimes(int ShowTimes) {
                this.ShowTimes = ShowTimes;
            }

            public int getStart() {
                return start;
            }

            public void setStart(int start) {
                this.start = start;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getEnd() {
                return end;
            }

            public void setEnd(int end) {
                this.end = end;
            }

            public boolean isSkip_hide() {
                return skip_hide;
            }

            public void setSkip_hide(boolean skip_hide) {
                this.skip_hide = skip_hide;
            }

            public String getSkip_url() {
                return skip_url;
            }

            public void setSkip_url(String skip_url) {
                this.skip_url = skip_url;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public JumpInfoBean getJump_info() {
                return jump_info;
            }

            public void setJump_info(JumpInfoBean jump_info) {
                this.jump_info = jump_info;
            }

            public VideoInfoBean getVideo_info() {
                return video_info;
            }

            public void setVideo_info(VideoInfoBean video_info) {
                this.video_info = video_info;
            }

            public GifInfoBean getGif_info() {
                return gif_info;
            }

            public void setGif_info(GifInfoBean gif_info) {
                this.gif_info = gif_info;
            }

            public static class JumpInfoBean {
                public static class ExtraBean {
                }
            }

            public static class VideoInfoBean {
            }

            public static class GifInfoBean {
            }
        }
    }
}
