package com.bnkk.padcmmnews.delegates;

import com.bnkk.padcmmnews.data.vo.NewsVO;

/**
 * Created by E5-575G on 11/11/2017.
 */

public interface NewsItemDelegate {

    void onTapComment();

    void onTapSendTo();

    void onTapFavourite();

    void onTapStatistics();

    void onTapNews(NewsVO news);
}
