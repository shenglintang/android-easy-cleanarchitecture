package com.smartdengg.presentation.user;

import com.smartdengg.presentation.MVPPresenter;
import com.smartdengg.presentation.MVPView;

/**
 * 创建时间: 2017/06/19 22:46 <br>
 * 作者: dengwei <br>
 * 描述:
 */
interface UserContract {

  interface Presenter<T> extends MVPPresenter<View<T>> {
    void loadData(String key);
  }

  interface View<T> extends MVPView<T> {

    void showProgress();
  }
}
