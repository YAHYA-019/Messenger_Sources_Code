package com.facebook.smartcapture.download;

import X.0Q8;
import X.11T;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Fw;
import X.1Kd;
import X.1Lm;
import X.2vC;
import X.2vD;
import X.2vI;
import X.4YV;
import X.C01s;
import X.C2v7;
import X.Kr8;
import X.LGc;
import X.LYm;
import X.LfP;
import X.MIi;
import android.content.Context;
import android.os.Parcelable;
import com.facebook.models.ModelLoader;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: FbVoltronAndNmlModulesDownloader.class */
public final class FbVoltronAndNmlModulesDownloader extends Kr8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGc(FbVoltronAndNmlModulesDownloader.class, 0);
    public C01s A00;
    public C2v7 A01;
    public Executor A02;
    public ModelLoader A03;

    public static final void A00(Context context, FbVoltronAndNmlModulesDownloader fbVoltronAndNmlModulesDownloader) {
        fbVoltronAndNmlModulesDownloader.A01 = (C2v7) 1Bi.A03(17111);
        fbVoltronAndNmlModulesDownloader.A03 = (ModelLoader) 1Lm.A05(context, 1Fw.A06(1Bn.A0E(context, (1BY) null, 16428)), 49686);
        fbVoltronAndNmlModulesDownloader.A00 = 4YV.A0G();
        fbVoltronAndNmlModulesDownloader.A02 = (Executor) 1Bi.A03(16432);
    }

    public static final void A01(Context context, FbVoltronAndNmlModulesDownloader fbVoltronAndNmlModulesDownloader, MIi mIi, 2vC r304) {
        String str;
        A00(context, fbVoltronAndNmlModulesDownloader);
        C2v7 c2v7 = fbVoltronAndNmlModulesDownloader.A01;
        if (c2v7 == null) {
            str = "appModuleManager";
        } else {
            2vD A00 = c2v7.A00(r304);
            A00.A02("creditcardscanner");
            2vI A01 = A00.A01();
            Executor executor = fbVoltronAndNmlModulesDownloader.A02;
            if (executor != null) {
                A01.A05(new LYm(mIi, fbVoltronAndNmlModulesDownloader, 1), executor);
                return;
            }
            str = "executor";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A02(Context context, MIi mIi) {
        String str;
        11T.A0F(mIi, 1);
        A00(context, this);
        ModelLoader modelLoader = this.A03;
        if (modelLoader == null) {
            str = "modelLoader";
        } else {
            ListenableFuture load = modelLoader.load("id_detector_pt", 1L);
            LfP lfP = new LfP(this, mIi, 14);
            Executor executor = this.A02;
            if (executor != null) {
                1Kd.A0F(lfP, load, executor);
                return;
            }
            str = "executor";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A03(Context context, MIi mIi) {
        String str;
        11T.A0F(mIi, 1);
        A00(context, this);
        ModelLoader modelLoader = this.A03;
        if (modelLoader == null) {
            str = "modelLoader";
        } else {
            ListenableFuture load = modelLoader.load("ocr2go_credit_card_models", 2);
            LfP lfP = new LfP(this, mIi, 15);
            Executor executor = this.A02;
            if (executor != null) {
                1Kd.A0F(lfP, load, executor);
                return;
            }
            str = "executor";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
