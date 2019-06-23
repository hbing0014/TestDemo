package com.example.testdemo.presenter;

import com.example.testdemo.view.IBaseView;

public class BasePresenterImpl<T extends IBaseView, V> implements IBasePresenter<V> {
    private IBaseView mBaseView;

    public BasePresenterImpl(T view) {
        this.mBaseView = view;
    }

    @Override
    public void beforeRequest(int requestTag) {
        mBaseView.showProgress(requestTag);
    }

    @Override
    public void requestError(Throwable e, int requestTag) {
        mBaseView.loadDataError(e, requestTag);
    }

    @Override
    public void requestComplete(int requestTag) {
        mBaseView.hideProgress(requestTag);
    }

    @Override
    public void retuestSuccess(V callBack, int requestTag) {
        mBaseView.loadDataSuccess(callBack, requestTag);
    }
}
