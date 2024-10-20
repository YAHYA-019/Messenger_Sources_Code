package com.facebookpay.offsite.models.message;

import com.facebookpay.expresscheckout.handler.ECPHandler;

/* loaded from: MessageHandler.class */
public interface MessageHandler {
    ECPHandler getEcpHandler();

    void handleMessage(String str, String str2);
}
