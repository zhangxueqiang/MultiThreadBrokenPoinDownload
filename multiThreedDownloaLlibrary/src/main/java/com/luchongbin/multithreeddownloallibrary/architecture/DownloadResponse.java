package com.luchongbin.multithreeddownloallibrary.architecture;


import com.luchongbin.multithreeddownloallibrary.DownloadException;

/**
 * Created by luchongbin on 2018/10/30.
 */
public interface DownloadResponse {

    void onStarted();

    void onConnecting();

    void onConnected(long time, long length, boolean acceptRanges);

    void onConnectFailed(DownloadException e);

    void onConnectCanceled();

    void onDownloadProgress(long finished, long length, int percent);

    void onDownloadCompleted();

    void onDownloadPaused();

    void onDownloadCanceled();

    void onDownloadFailed(DownloadException e);
}
