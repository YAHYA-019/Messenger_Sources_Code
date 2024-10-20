package com.facebook.xapp.messaging.powerups.avatars.repository.datasource;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Dt;
import X.0TB;
import X.0fH;
import X.11T;
import X.1Br;
import X.4YU;
import X.5HP;
import X.7zL;
import X.82O;
import X.9MM;
import X.9Rm;
import X.AnonymousClass001;
import X.C5en;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function2;

/* loaded from: AvatarPowerUpDownloader$downloadAsset$2.class */
public final class AvatarPowerUpDownloader$downloadAsset$2 extends 0DO implements Function2 {
    public final /* synthetic */ 9Rm $asset;
    public int label;
    public final /* synthetic */ AvatarPowerUpDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarPowerUpDownloader$downloadAsset$2(9Rm r302, AvatarPowerUpDownloader avatarPowerUpDownloader, 0DR r304) {
        super(2, r304);
        this.$asset = r302;
        this.this$0 = avatarPowerUpDownloader;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new AvatarPowerUpDownloader$downloadAsset$2(this.$asset, this.this$0, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        C5en A00 = C5en.A00();
        A00.A0E = this.$asset.A00;
        A00.A0P = 5HP.A02;
        Uri uri = ((82O) 1Br.A0B(this.this$0.A01)).A0Y(7zL.A09()).A01(4YU.A0Y(A00)).A0E;
        9MM r0 = (9MM) this.this$0.A02.getValue();
        11T.A0D(uri);
        String str = this.$asset.A01;
        11T.A0F(uri, 0);
        String path = uri.getPath();
        boolean z = false;
        if (path != null) {
            try {
                0TB.A00(AnonymousClass001.A0E(path), new File((File) r0.A00.getValue(), str), true);
                z = true;
            } catch (IOException e) {
                0fH.A0u("AvatarPowerUpFileManager", "fail saving power up image into user cache", e);
            }
        }
        if (!z) {
            uri = null;
        }
        return uri;
    }
}
