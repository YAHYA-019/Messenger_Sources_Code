package com.facebook.messaging.media.picker;

import X.1BQ;
import X.2eS;
import X.5HV;
import X.6dK;
import X.C00i;
import X.C52j;
import X.C6d6;
import X.GOp;
import X.HRx;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.video.player.RichVideoPlayer;
import com.facebook.widget.CustomFrameLayout;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: MediaPickerPopupVideoView.class */
public class MediaPickerPopupVideoView extends CustomFrameLayout implements CallerContextable {
    public static final CallerContext A0A = CallerContext.A0A(MediaPickerPopupVideoView.class, "messenger_montage_media_picker", "messenger_montage_media_picker");
    public 2eS A00;
    public C00i A01;
    public HRx A02;
    public MediaResource A03;
    public RichVideoPlayer A04;
    public ExecutorService A05;
    public boolean A06;
    public boolean A07;
    public final C00i A08;
    public final 5HV A09;

    public MediaPickerPopupVideoView(Context context) {
        super(context);
        this.A08 = 1BQ.A01();
        this.A09 = GOp.A0z();
    }

    public MediaPickerPopupVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08 = 1BQ.A01();
        this.A09 = GOp.A0z();
    }

    public MediaPickerPopupVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = 1BQ.A01();
        this.A09 = GOp.A0z();
    }

    public static void A00(MediaPickerPopupVideoView mediaPickerPopupVideoView, C52j c52j) {
        RichVideoPlayer richVideoPlayer = mediaPickerPopupVideoView.A04;
        if (richVideoPlayer == null || !richVideoPlayer.BWa()) {
            return;
        }
        mediaPickerPopupVideoView.A04.CWm(c52j);
        mediaPickerPopupVideoView.A04.invalidate();
        mediaPickerPopupVideoView.A04.A0H();
        6dK A0F = mediaPickerPopupVideoView.A04.A0F();
        List<C6d6> list = A0F.A0A;
        for (C6d6 c6d6 : list) {
            c6d6.A0R();
            c6d6.A0O();
            c6d6.A0I();
        }
        list.clear();
        A0F.A09.clear();
        A0F.A04 = null;
        mediaPickerPopupVideoView.A04.removeAllViews();
        mediaPickerPopupVideoView.A04 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r0.equals(r0.A0E) != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0V(com.facebook.auth.usersession.FbUserSession r302, X.C52j r303) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.picker.MediaPickerPopupVideoView.A0V(com.facebook.auth.usersession.FbUserSession, X.52j):void");
    }
}
