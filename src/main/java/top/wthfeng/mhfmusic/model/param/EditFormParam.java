package top.wthfeng.mhfmusic.model.param;

/**
 * 编辑、添加歌单入参
 * @author wangtonghe
 * @date 2016/4/26 22:39
 * @email wthfeng@126.com
 */
public class EditFormParam {
    private int id;
    private String name;
    private String cover;
    private String[] labels;
    private String info;
    /**
     * 歌曲id集合
     */
    private int []musicIds;

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

    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int[] getMusicIds() {
        return musicIds;
    }

    public void setMusicIds(int[] musicIds) {
        this.musicIds = musicIds;
    }
}