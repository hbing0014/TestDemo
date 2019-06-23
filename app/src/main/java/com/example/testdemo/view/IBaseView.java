package com.example.testdemo.view;

public interface IBaseView<T> {
    /**
     *  提示用户
     * @param msg 提示信息
     * @param requestTag 请求标识
     */
    void toast(String msg, int requestTag);

    /**
     * 显示加载进度
     */
    void showProgress(int requestTag);
    /**
     * 显示加载进度
     */
    void hideProgress(int requestTag);

    /**
     *  请求网络成功
     * @param data
     * @param requestTag
     */
    void loadDataSuccess(T data, int requestTag);

    /**
     * 请求失败
     * @param e 失败信息
     * @param requestTag
     */
    void loadDataError(Throwable e, int requestTag);
}
