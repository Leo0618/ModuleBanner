package com.lzj.modulebanner;


/**
 * function : banner实体数据对象.
 *
 * <p>Created by lzj on 2016/3/9.<p/>
 */
public class BannerBean {
    private int testImgResId;
    private String imgurl;
    private String desc;
    private String detailurl;

    public BannerBean(int testImgResId, String imgurl, String desc, String detailurl) {
        this.testImgResId = testImgResId;
        this.imgurl = imgurl;
        this.desc = desc;
        this.detailurl = detailurl;
    }

    public int getTestImgResId() {
        return testImgResId;
    }

    public void setTestImgResId(int testImgResId) {
        this.testImgResId = testImgResId;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDetailurl() {
        return detailurl;
    }

    public void setDetailurl(String detailurl) {
        this.detailurl = detailurl;
    }
}
