package com.facebook.xapp.messaging.sticker.favorite.impl;

import X.04S;
import X.0DL;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.11T;
import X.1qX;
import X.22C;
import X.2aI;
import X.2aK;
import X.4cZ;
import X.7Gy;
import X.7zL;
import X.8yH;
import X.AIr;
import X.AYt;
import X.AnonymousClass001;
import X.C3kz;
import com.facebook.msys.mca.MailboxNullable;
import kotlin.jvm.functions.Function2;

/* loaded from: MsysFavoriteStickerFetcher$isFavoriteStickerAndExistsOnDb$2.class */
public final class MsysFavoriteStickerFetcher$isFavoriteStickerAndExistsOnDb$2 extends 0DO implements Function2 {
    public final /* synthetic */ AYt $callback;
    public final /* synthetic */ 8yH $mailboxStickerPicker;
    public final /* synthetic */ 22C $mailboxTam;
    public final /* synthetic */ String $stickerId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ 7Gy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysFavoriteStickerFetcher$isFavoriteStickerAndExistsOnDb$2(8yH r302, 22C r303, AYt aYt, 7Gy r305, String str, 0DR r307) {
        super(2, r307);
        this.$callback = aYt;
        this.this$0 = r305;
        this.$mailboxTam = r303;
        this.$stickerId = str;
        this.$mailboxStickerPicker = r302;
    }

    public final 0DR create(Object obj, 0DR r303) {
        AYt aYt = this.$callback;
        7Gy r0 = this.this$0;
        MsysFavoriteStickerFetcher$isFavoriteStickerAndExistsOnDb$2 msysFavoriteStickerFetcher$isFavoriteStickerAndExistsOnDb$2 = new MsysFavoriteStickerFetcher$isFavoriteStickerAndExistsOnDb$2(this.$mailboxStickerPicker, this.$mailboxTam, aYt, r0, this.$stickerId, r303);
        msysFavoriteStickerFetcher$isFavoriteStickerAndExistsOnDb$2.L$0 = obj;
        return msysFavoriteStickerFetcher$isFavoriteStickerAndExistsOnDb$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v93, types: [X.4cZ] */
    public final Object invokeSuspend(Object obj) {
        C3kz A02;
        AYt aYt;
        boolean z;
        1qX r0;
        1qX A0t;
        boolean z2;
        0Ds r02 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            2aI r03 = (2aI) this.L$0;
            AIr aIr = new AIr(this.$mailboxTam, this.$stickerId, null, 13);
            0DL r04 = 0DL.A00;
            A02 = 2aK.A02(r04, aIr, r03);
            C3kz A022 = 2aK.A02(r04, new AIr(this.$mailboxStickerPicker, this.$stickerId, null, 14), r03);
            aYt = this.$callback;
            7Gy r05 = this.this$0;
            this.L$0 = A02;
            this.L$1 = aYt;
            this.L$2 = r05;
            this.label = 1;
            obj = A022.A0D(this);
            if (obj == r02) {
                return r02;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0M();
                }
                z = this.Z$0;
                aYt = (AYt) this.L$0;
                0Dt.A00(obj);
                11T.A0C(obj);
                A0t = 7zL.A0t(obj);
                z2 = false;
                if (A0t != null && 1qX.A00(A0t) > 0) {
                    z2 = true;
                }
                aYt.Bpu(z, z2);
                return 04S.A00;
            }
            aYt = (AYt) this.L$1;
            A02 = (4cZ) this.L$0;
            0Dt.A00(obj);
        }
        11T.A0C(obj);
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        1qX r06 = (1qX) mailboxNullable.value;
        z = false;
        if (r06 != null && 1qX.A00(r06) > 0 && (r0 = (1qX) mailboxNullable.value) != null && r0.mResultSet.getBoolean(0, 0)) {
            z = true;
        }
        7Gy r07 = this.this$0;
        this.L$0 = aYt;
        this.L$1 = r07;
        this.L$2 = null;
        this.Z$0 = z;
        this.label = 2;
        obj = A02.A0D(this);
        if (obj == r02) {
            return r02;
        }
        11T.A0C(obj);
        A0t = 7zL.A0t(obj);
        z2 = false;
        if (A0t != null) {
            z2 = true;
        }
        aYt.Bpu(z, z2);
        return 04S.A00;
    }
}
