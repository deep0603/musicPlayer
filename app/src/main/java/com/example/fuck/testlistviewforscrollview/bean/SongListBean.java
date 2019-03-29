package com.example.fuck.testlistviewforscrollview.bean;

import java.util.List;

public class SongListBean {

    /**
     * playlists : [{"name":"春分｜三月春光流淌，像青草一样呼吸","id":2717255137,"trackNumberUpdateTime":1553065936577,"status":0,"userId":1489554923,"createTime":1553052050426,"updateTime":1553065936577,"subscribedCount":3938,"trackCount":38,"cloudTrackCount":0,"coverImgUrl":"http://p2.music.126.net/tSOA6L3nZeTx-2gm_Jrv7g==/109951163938339250.jpg","coverImgId":109951163938339250,"description":"春分是二十四节气之一。\n春分时，全球昼夜除极点附近以外几乎等长。\n春分后，北半球各地昼渐长夜渐短，南半球各地夜渐长昼渐短。\n\n春天起，万物新，歌单选曲多为女声，想用这些清新自然的女声换你一颗春雨般湿漉漉的心。\n三月尾，春光流淌，但愿你能如春草般在这片土地上自由地呼吸。\n\n封面：春夏\n标题灵感为顾城","tags":["华语","流行","安静"],"playCount":879823,"trackUpdateTime":1553065944408,"specialType":0,"totalDuration":0,"creator":{"defaultAvatar":false,"province":110000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/XwCNcx3dYRV9AaFvJ_gtcA==/109951163407748353.jpg","accountStatus":0,"gender":2,"city":110101,"birthday":971971200000,"userId":1489554923,"userType":200,"nickname":"Tataaaaaaa_","signature":"后现代主义的丧。","description":"","detailDescription":"","avatarImgId":109951163407748350,"backgroundImgId":109951163454950750,"backgroundUrl":"http://p1.music.126.net/59yDfNb8mVzWoKGpJXeZjg==/109951163454950746.jpg","authority":0,"mutual":false,"expertTags":["华语"],"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"avatarImgIdStr":"109951163407748353","backgroundImgIdStr":"109951163454950746","avatarImgId_str":"109951163407748353"},"tracks":null,"subscribers":[],"subscribed":false,"commentThreadId":"A_PL_0_2717255137","newImported":false,"adType":0,"highQuality":false,"privacy":0,"ordered":true,"anonimous":false,"shareCount":35,"coverImgId_str":"109951163938339250","commentCount":67},{"name":"hindistan.nahxa","id":2717040121,"trackNumberUpdateTime":1553022376564,"status":0,"userId":1310111625,"createTime":1553021372675,"updateTime":1553022376564,"subscribedCount":0,"trackCount":28,"cloudTrackCount":0,"coverImgUrl":"http://p2.music.126.net/yiE3kiFbQNRSq6yQOdoJgw==/884007348767110.jpg","coverImgId":884007348767110,"description":null,"tags":[],"playCount":13,"trackUpdateTime":1553041669892,"specialType":0,"totalDuration":0,"creator":{"defaultAvatar":false,"province":650000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/tnIFraj2JTs4f6hXQjdgCA==/109951163937783125.jpg","accountStatus":0,"gender":2,"city":653100,"birthday":1589919348731,"userId":1310111625,"userType":0,"nickname":"sewgeee","signature":"ئاۋۋال چۈشەن، ئاندىن ئىشەن \u2026\u2026","description":"","detailDescription":"","avatarImgId":109951163937783120,"backgroundImgId":109951163937784160,"backgroundUrl":"http://p1.music.126.net/vGLfOHPjip7cxengHF2jwA==/109951163937784164.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"avatarImgIdStr":"109951163937783125","backgroundImgIdStr":"109951163937784164","avatarImgId_str":"109951163937783125"},"tracks":null,"subscribers":[],"subscribed":false,"commentThreadId":"A_PL_0_2717040121","newImported":false,"adType":0,"highQuality":false,"privacy":0,"ordered":false,"anonimous":false,"shareCount":0,"commentCount":0}]
     * total : 3499
     * code : 200
     * more : true
     * cat : 全部
     */

    private int                 code;
    private String              cat;
    private List<PlaylistsBean> playlists;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public List<PlaylistsBean> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<PlaylistsBean> playlists) {
        this.playlists = playlists;
    }

    public static class PlaylistsBean {
        /**
         * name : 春分｜三月春光流淌，像青草一样呼吸
         * id : 2717255137
         * trackNumberUpdateTime : 1553065936577
         * status : 0
         * userId : 1489554923
         * createTime : 1553052050426
         * updateTime : 1553065936577
         * subscribedCount : 3938
         * trackCount : 38
         * cloudTrackCount : 0
         * coverImgUrl : http://p2.music.126.net/tSOA6L3nZeTx-2gm_Jrv7g==/109951163938339250.jpg
         * coverImgId : 109951163938339250
         * description : 春分是二十四节气之一。
         春分时，全球昼夜除极点附近以外几乎等长。
         春分后，北半球各地昼渐长夜渐短，南半球各地夜渐长昼渐短。

         春天起，万物新，歌单选曲多为女声，想用这些清新自然的女声换你一颗春雨般湿漉漉的心。
         三月尾，春光流淌，但愿你能如春草般在这片土地上自由地呼吸。

         封面：春夏
         标题灵感为顾城
         * tags : ["华语","流行","安静"]
         * playCount : 879823
         * trackUpdateTime : 1553065944408
         * specialType : 0
         * totalDuration : 0
         * creator : {"defaultAvatar":false,"province":110000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/XwCNcx3dYRV9AaFvJ_gtcA==/109951163407748353.jpg","accountStatus":0,"gender":2,"city":110101,"birthday":971971200000,"userId":1489554923,"userType":200,"nickname":"Tataaaaaaa_","signature":"后现代主义的丧。","description":"","detailDescription":"","avatarImgId":109951163407748350,"backgroundImgId":109951163454950750,"backgroundUrl":"http://p1.music.126.net/59yDfNb8mVzWoKGpJXeZjg==/109951163454950746.jpg","authority":0,"mutual":false,"expertTags":["华语"],"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"avatarImgIdStr":"109951163407748353","backgroundImgIdStr":"109951163454950746","avatarImgId_str":"109951163407748353"}
         * tracks : null
         * subscribers : []
         * subscribed : false
         * commentThreadId : A_PL_0_2717255137
         * newImported : false
         * adType : 0
         * highQuality : false
         * privacy : 0
         * ordered : true
         * anonimous : false
         * shareCount : 35
         * coverImgId_str : 109951163938339250
         * commentCount : 67
         */

        private String name;
        private long         id;
        private int          userId;
        private int          subscribedCount;
        private int          trackCount;
        private String       coverImgUrl;
        private long         coverImgId;
        private String       description;
        private int          playCount;
        private CreatorBean  creator;
        private List<String> tags;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getSubscribedCount() {
            return subscribedCount;
        }

        public void setSubscribedCount(int subscribedCount) {
            this.subscribedCount = subscribedCount;
        }

        public int getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(int trackCount) {
            this.trackCount = trackCount;
        }

        public String getCoverImgUrl() {
            return coverImgUrl;
        }

        public void setCoverImgUrl(String coverImgUrl) {
            this.coverImgUrl = coverImgUrl;
        }

        public long getCoverImgId() {
            return coverImgId;
        }

        public void setCoverImgId(long coverImgId) {
            this.coverImgId = coverImgId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getPlayCount() {
            return playCount;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }

        public CreatorBean getCreator() {
            return creator;
        }

        public void setCreator(CreatorBean creator) {
            this.creator = creator;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public static class CreatorBean {
            /**
             * defaultAvatar : false
             * province : 110000
             * authStatus : 0
             * followed : false
             * avatarUrl : http://p1.music.126.net/XwCNcx3dYRV9AaFvJ_gtcA==/109951163407748353.jpg
             * accountStatus : 0
             * gender : 2
             * city : 110101
             * birthday : 971971200000
             * userId : 1489554923
             * userType : 200
             * nickname : Tataaaaaaa_
             * signature : 后现代主义的丧。
             * description :
             * detailDescription :
             * avatarImgId : 109951163407748350
             * backgroundImgId : 109951163454950750
             * backgroundUrl : http://p1.music.126.net/59yDfNb8mVzWoKGpJXeZjg==/109951163454950746.jpg
             * authority : 0
             * mutual : false
             * expertTags : ["华语"]
             * experts : null
             * djStatus : 0
             * vipType : 0
             * remarkName : null
             * avatarImgIdStr : 109951163407748353
             * backgroundImgIdStr : 109951163454950746
             * avatarImgId_str : 109951163407748353
             */

            private boolean defaultAvatar;
            private int          province;
            private int          authStatus;
            private boolean      followed;
            private String       avatarUrl;
            private int          accountStatus;
            private int          gender;
            private int          city;
            private long         birthday;
            private int          userId;
            private int          userType;
            private String       nickname;
            private String       signature;
            private String       description;
            private String       detailDescription;
            private long         avatarImgId;
            private long         backgroundImgId;
            private String       backgroundUrl;
            private int          authority;
            private boolean      mutual;
            private Object       experts;
            private int          djStatus;
            private int          vipType;
            private List<String> expertTags;

            public boolean isDefaultAvatar() {
                return defaultAvatar;
            }

            public void setDefaultAvatar(boolean defaultAvatar) {
                this.defaultAvatar = defaultAvatar;
            }

            public int getProvince() {
                return province;
            }

            public void setProvince(int province) {
                this.province = province;
            }

            public int getAuthStatus() {
                return authStatus;
            }

            public void setAuthStatus(int authStatus) {
                this.authStatus = authStatus;
            }

            public boolean isFollowed() {
                return followed;
            }

            public void setFollowed(boolean followed) {
                this.followed = followed;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public int getAccountStatus() {
                return accountStatus;
            }

            public void setAccountStatus(int accountStatus) {
                this.accountStatus = accountStatus;
            }

            public int getGender() {
                return gender;
            }

            public void setGender(int gender) {
                this.gender = gender;
            }

            public int getCity() {
                return city;
            }

            public void setCity(int city) {
                this.city = city;
            }

            public long getBirthday() {
                return birthday;
            }

            public void setBirthday(long birthday) {
                this.birthday = birthday;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getUserType() {
                return userType;
            }

            public void setUserType(int userType) {
                this.userType = userType;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getDetailDescription() {
                return detailDescription;
            }

            public void setDetailDescription(String detailDescription) {
                this.detailDescription = detailDescription;
            }

            public long getAvatarImgId() {
                return avatarImgId;
            }

            public void setAvatarImgId(long avatarImgId) {
                this.avatarImgId = avatarImgId;
            }

            public long getBackgroundImgId() {
                return backgroundImgId;
            }

            public void setBackgroundImgId(long backgroundImgId) {
                this.backgroundImgId = backgroundImgId;
            }

            public String getBackgroundUrl() {
                return backgroundUrl;
            }

            public void setBackgroundUrl(String backgroundUrl) {
                this.backgroundUrl = backgroundUrl;
            }

            public int getAuthority() {
                return authority;
            }

            public void setAuthority(int authority) {
                this.authority = authority;
            }

            public boolean isMutual() {
                return mutual;
            }

            public void setMutual(boolean mutual) {
                this.mutual = mutual;
            }

            public Object getExperts() {
                return experts;
            }

            public void setExperts(Object experts) {
                this.experts = experts;
            }

            public int getDjStatus() {
                return djStatus;
            }

            public void setDjStatus(int djStatus) {
                this.djStatus = djStatus;
            }

            public int getVipType() {
                return vipType;
            }

            public void setVipType(int vipType) {
                this.vipType = vipType;
            }

            public List<String> getExpertTags() {
                return expertTags;
            }

            public void setExpertTags(List<String> expertTags) {
                this.expertTags = expertTags;
            }
        }
    }
}
