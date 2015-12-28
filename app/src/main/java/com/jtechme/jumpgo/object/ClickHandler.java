/*
 * Copyright 2014 A.C.R. Development
 */
package com.jtechme.jumpgo.object;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

import com.jtechme.jumpgo.controller.BrowserController;

public class ClickHandler extends Handler {

    private BrowserController mBrowserController;

    public ClickHandler(Context context) {
        try {
            mBrowserController = (BrowserController) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context + " must implement BrowserController");
        }
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        String url = msg.getData().getString("url");
        mBrowserController.longClickPage(url);
    }
}
