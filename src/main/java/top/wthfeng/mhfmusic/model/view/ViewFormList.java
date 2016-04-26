package top.wthfeng.mhfmusic.model.view;

/**
 * 歌单列表出参
 * @author wangtonghe
 * @date 2016/4/26 22:25
 * @email wthfeng@126.com
 */
public class ViewFormList {
    private int id;
    private String name;
    private String cover;
    private String []label;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 喜欢人数
     */
    private int likeNum;
    /**
     * 收藏数
     */
    private int collectNum;
    private int online;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String[] getLabel() {
        return label;
    }

    public void setLabel(String[] label) {
        this.label = label;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public int getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(int collectNum) {
        this.collectNum = collectNum;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }
}
