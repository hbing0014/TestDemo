package com.example.testdemo.presenter;

public interface IBasePresenter<T> {
    /**
     * 请求前
     *
     * @param requestTag
     */
    void beforeRequest(int requestTag);

    /**
     * 请求失败
     *
     * @param e
     * @param requestTag
     */
    void requestError(Throwable e, int requestTag);

    /**
     * 请求完成
     *
     * @param requestTag
     */
    void requestComplete(int requestTag);

    /**
     * 请求成功
     *
     * @param callBack
     * @param requestTag
     */
    void retuestSuccess(T callBack, int requestTag);
}
