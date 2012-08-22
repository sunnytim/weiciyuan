package org.qii.weiciyuan.bean;

import android.text.TextUtils;
import org.qii.weiciyuan.R;
import org.qii.weiciyuan.support.utils.GlobalContext;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * User: qii
 * Date: 12-7-29
 */

public class MessageBean implements Serializable {


    public String getCreated_at() {
        if (!TextUtils.isEmpty(created_at)) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm");

            return format.format(new Date(created_at));

        }
        return "";
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public String getTruncated() {
        return truncated;
    }

    public void setTruncated(String truncated) {
        this.truncated = truncated;
    }

    public String getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    public void setIn_reply_to_status_id(String in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    public String getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    public void setIn_reply_to_user_id(String in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    public String getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    public GeoBean getGeo() {
        return geo;
    }

    public void setGeo(GeoBean geo) {
        this.geo = geo;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getReposts_count() {
        return reposts_count;
    }

    public void setReposts_count(String reposts_count) {
        this.reposts_count = reposts_count;
    }

    public String getComments_count() {
        return comments_count;
    }

    public void setComments_count(String comments_count) {
        this.comments_count = comments_count;
    }

//    public String getAnnotations() {
//        return annotations;
//    }
//
//    public void setAnnotations(String annotations) {
//        this.annotations = annotations;
//    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public MessageBean getRetweeted_status() {
        return retweeted_status;
    }

    public void setRetweeted_status(MessageBean retweeted_status) {
        this.retweeted_status = retweeted_status;
    }

    public String getListviewItemShowTime() {

        if (!TextUtils.isEmpty(created_at)) {
            Calendar cal = Calendar.getInstance();
            int nowMonth = cal.get(Calendar.MONTH) + 1;
            int nowDay = cal.get(Calendar.DAY_OF_MONTH);
            int nowHour = cal.get(Calendar.HOUR);
            int nowMinute = cal.get(Calendar.MINUTE);
            int nowSeconds = cal.get(Calendar.SECOND);


            Calendar messageCal = Calendar.getInstance();
            messageCal.setTime(new Date(created_at));
            int month = messageCal.get(Calendar.MONTH) + 1;
            int day = messageCal.get(Calendar.DAY_OF_MONTH);
            int hour = messageCal.get(Calendar.HOUR);
            int minute = messageCal.get(Calendar.MINUTE);
            int seconds = messageCal.get(Calendar.SECOND);

            if (nowMonth > month)
                return "" + (nowMonth - month) + GlobalContext.getInstance().getString(R.string.month);

            if (nowDay > day)
                return "" + (nowDay - day) + GlobalContext.getInstance().getString(R.string.day);

            if (nowHour > hour)
                return "" + (nowHour - hour) + GlobalContext.getInstance().getString(R.string.hour);

            if (nowMinute > minute)
                return "" + (nowMinute - minute) + GlobalContext.getInstance().getString(R.string.min);

            if (nowMinute == minute)
                return GlobalContext.getInstance().getString(R.string.justnow);


            return "";
        }

        return listviewItemShowTime;
    }

    public void setListviewItemShowTime(String listviewItemShowTime) {
        this.listviewItemShowTime = listviewItemShowTime;
    }

    private String created_at;
    private String id;
    private String text;
    private String source;
    private boolean favorited;
    private String truncated;
    private String in_reply_to_status_id;
    private String in_reply_to_user_id;
    private String in_reply_to_screen_name;
    private String mid;
    private String reposts_count;
    private String comments_count;
    //    private Object annotations;
    private UserBean user;
    private MessageBean retweeted_status;
    private GeoBean geo;

    private String thumbnail_pic;
    private String bmiddle_pic;
    private String original_pic;

    public String getThumbnail_pic() {
        return thumbnail_pic;
    }

    public void setThumbnail_pic(String thumbnail_pic) {
        this.thumbnail_pic = thumbnail_pic;
    }

    public String getBmiddle_pic() {
        return bmiddle_pic;
    }

    public void setBmiddle_pic(String bmiddle_pic) {
        this.bmiddle_pic = bmiddle_pic;
    }

    public String getOriginal_pic() {
        return original_pic;
    }

    public void setOriginal_pic(String original_pic) {
        this.original_pic = original_pic;
    }

    private String listviewItemShowTime;
}
