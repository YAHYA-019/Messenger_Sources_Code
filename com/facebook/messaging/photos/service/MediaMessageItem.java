package com.facebook.messaging.photos.service;

import X.HnS;
import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.UserKey;

/* loaded from: MediaMessageItem.class */
public interface MediaMessageItem extends Parcelable {
    void AEz(Context context, HnS hnS);

    Uri AqA();

    String Aw7();

    MediaResource AwL();

    String Awv();

    Message Ax8();

    int B0a();

    int B0d();

    String BAM();

    UserKey BAN();

    Uri BFd();

    MediaResource BIJ();

    boolean BQR();

    boolean BSu();

    boolean BTC();

    boolean BUo();

    boolean BW5(Context context);

    void Cp4(boolean z);
}
