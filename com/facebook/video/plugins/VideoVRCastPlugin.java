package com.facebook.video.plugins;

import X.0S2;
import X.11T;
import X.1Bi;
import X.1Br;
import X.4YU;
import X.6TI;
import X.7zQ;
import X.AbF;
import X.C09s;
import X.C1oo;
import X.C6d6;
import X.DKF;
import X.DKG;
import X.GPl;
import X.HNb;
import X.Hxx;
import X.IKB;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.resources.ui.FbButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: VideoVRCastPlugin.class */
public final class VideoVRCastPlugin extends C6d6 {
    public FbButton A00;
    public 6TI A01;
    public GPl A02;
    public boolean A03;
    public boolean A04;
    public final View.OnClickListener A05;
    public final Hxx A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoVRCastPlugin(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoVRCastPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoVRCastPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PackageManager packageManager;
        Integer num;
        11T.A0F(context, 1);
        this.A06 = (Hxx) 1Bi.A03(115556);
        View.OnClickListener ikb = new IKB(this, 70);
        this.A05 = ikb;
        if (HNb.A00 == null && (packageManager = context.getPackageManager()) != null) {
            Intent component = AbF.A05().setPackage("com.facebook.akira").setComponent(new ComponentName("com.facebook.akira", "com.facebook.akira.AkiraActivity"));
            11T.A0A(component);
            if (packageManager.resolveActivity(component, 65536) != null) {
                num = 0S2.A00;
            } else {
                Intent type = 4YU.A0A("com.oculus.cinema.action.CAST").setType("video/vr");
                11T.A0A(type);
                num = packageManager.resolveActivity(type, 65536) != null ? 0S2.A01 : 0S2.A0N;
            }
            HNb.A00 = num;
        }
        GPl gPl = null;
        if (HNb.A00 == 0S2.A0N) {
            this.A00 = null;
            this.A02 = null;
            this.A04 = false;
            return;
        }
        A0C(2132543564);
        FbButton fbButton = (FbButton) C09s.A01(this, 2131362933);
        this.A00 = fbButton;
        if (fbButton != null) {
            fbButton.setOnClickListener(ikb);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2v);
        11T.A0A(obtainStyledAttributes);
        this.A04 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (this.A04) {
            7zQ.A19(this.A00);
        }
        gPl = this.A04 ? GPl.A00(this, ActionId.RTMP_PACKET_RECEIVED) : gPl;
        this.A02 = gPl;
        A0h(gPl);
    }

    public /* synthetic */ VideoVRCastPlugin(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    @Override // X.C6d6
    public String A0H() {
        return "VideoVRCastPlugin";
    }

    @Override // X.C6d6
    public void A0N() {
        A0i(this.A02);
        A0M();
        super.A0N();
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        FbButton fbButton = this.A00;
        if (fbButton != null) {
            if (!z && this.A04 && this.A03) {
                return;
            }
            int i = 8;
            if (r302.A03.A12 && !1Br.A07(this.A06.A00).AZk(36310297765806095L)) {
                fbButton.setVisibility(8);
                this.A0D = true;
                return;
            }
            this.A0D = false;
            this.A01 = r302;
            if (!this.A04) {
                i = 0;
            }
            fbButton.setVisibility(i);
            if (z) {
                this.A03 = false;
            }
        }
    }
}
