package top.wthfeng.mhfmusic.dao;

import top.wthfeng.mhfmusic.model.param.EditFormParam;
import top.wthfeng.mhfmusic.model.param.FormListParam;
import top.wthfeng.mhfmusic.model.view.ViewFormDetails;
import top.wthfeng.mhfmusic.model.view.ViewFormList;

import java.util.List;

/**
 * 歌单 DAO
 * @author wangtonghe
 * @date 2016/4/26 23:03
 * @email wthfeng@126.com
 */
public interface FormDAO {
    /**
     * 获取歌单列表
     * @param param
     * @return
     */
    List<ViewFormList> list(FormListParam param);

    /**
     * 歌单上下线
     * @param formId
     * @param flag
     */
    void online(int formId,int flag);

    /**
     * 获取歌单详情
     * @param formId
     * @return
     */
    ViewFormDetails details(int formId);

    /**
     * 编辑歌单
     * @param param
     */
    void edit(EditFormParam param);

    /**
     * 添加歌单
     * @param param
     */
    void add(EditFormParam param);

}
