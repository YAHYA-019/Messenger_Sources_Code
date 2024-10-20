package com.facebook.cameracore.camerasdk.fboptic;

import X.AnonymousClass001;
import X.DKD;
import X.GOn;
import X.GOo;
import X.GcS;
import X.Gtz;
import X.H9F;
import X.HDF;
import X.HMG;
import X.HOr;
import X.HoE;
import X.Hqd;
import X.Hz3;
import X.I7e;
import X.I92;
import X.ID5;
import X.IEg;
import X.IEp;
import X.INW;
import X.INc;
import X.INh;
import X.IS7;
import X.Idg;
import X.Idp;
import X.J2W;
import X.J55;
import X.J5U;
import X.JGA;
import X.JGC;
import X.JIA;
import X.JJd;
import X.JOg;
import X.JQ9;
import X.RHv;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* loaded from: Camera1Device.class */
public final class Camera1Device {
    public int A00;
    public Hqd A01;
    public JJd A02;
    public I7e A03;
    public HoE A04;
    public JGC A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Idp A09;
    public final INh A0A;
    public final HOr A0B;
    public final I92 A0C;
    public final JGA A0D;
    public final Map A0E;
    public final Context A0F;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.I92, java.lang.Object] */
    public Camera1Device(Context context) {
        INh iNh = new INh();
        this.A0A = iNh;
        this.A0C = new Object();
        this.A07 = false;
        this.A06 = false;
        this.A0E = AnonymousClass001.A0u();
        this.A0D = new Idg(this);
        this.A0B = new HOr(this);
        this.A09 = new Idp(iNh);
        this.A0F = context.getApplicationContext();
    }

    public static void A00(Hz3 hz3, Hqd hqd, JOg jOg, Camera1Device camera1Device) {
        I92 i92 = camera1Device.A0C;
        if (i92.A03(hz3, hqd)) {
            camera1Device.A07 = false;
        }
        boolean z = hqd.A0E;
        INW inw = new INW(hz3, jOg, camera1Device);
        IEg iEg = IEg.A0O;
        RHv rHv = new RHv(inw, i92);
        if (iEg.A0A()) {
            iEg.A0L = false;
            ID5.A02((JIA) null, new FutureTask(new J55(2, rHv, iEg, z)));
        } else {
            rHv.A00.BnH(new Gtz("Failed to take photo.", new HDF(iEg)));
        }
    }

    public static void A01(Hz3 hz3, JJd jJd, Camera1Device camera1Device, Throwable th, boolean z) {
        if (!camera1Device.A0C.A04(hz3.A02)) {
            if (jJd != null) {
                jJd.onSuccess();
            }
        } else if (DKD.A10() == Thread.currentThread()) {
            A02(hz3, jJd, camera1Device, th, z);
        } else {
            HMG.A00.post(new J2W(hz3, jJd, camera1Device, th, z));
        }
    }

    public static void A02(Hz3 hz3, JJd jJd, Camera1Device camera1Device, Throwable th, boolean z) {
        H9F h9f = hz3.A02;
        I92 i92 = camera1Device.A0C;
        if (!i92.A04(h9f)) {
            if (jJd != null) {
                jJd.onSuccess();
                return;
            }
            return;
        }
        JQ9 jq9 = hz3.A03;
        if (!z) {
            jq9.BZh("camera_disconnect_requested", "com.facebook.cameracore.camerasdk.fboptic.Camera1Device", null, GOn.A0B(camera1Device));
        }
        A03(camera1Device, h9f, jq9, hz3.A04);
        IEg.A0O.A08(new GcS(new INc(jJd, camera1Device, jq9, th, z), i92, jq9, th));
        camera1Device.A0E.clear();
    }

    public static void A03(Camera1Device camera1Device, H9F h9f, JQ9 jq9, String str) {
        boolean z;
        I92 i92 = camera1Device.A0C;
        try {
            IEg iEg = IEg.A0O;
            IEp iEp = iEg.A07;
            if (i92.A04(h9f) && iEp != null) {
                synchronized (iEp) {
                    z = iEp.A03;
                }
                if (z) {
                    iEp.A08();
                    GOo.A1G(new IS7(i92, 0), new J5U(iEg, 2));
                }
            }
            i92.A02();
        } catch (RuntimeException e) {
            jq9.BZg(new Gtz(e.getMessage() != null ? e.getMessage() : "Error when releasing camera", e), "camera_error", "FbOpticDeviceController", "high", "", null, GOn.A0B(i92));
        }
        camera1Device.A02 = null;
        camera1Device.A03 = null;
        i92.A01 = null;
        try {
            i92.A02();
        } catch (Exception unused) {
        }
        camera1Device.A05 = null;
        Map map = camera1Device.A0E;
        Object remove = map.remove(str);
        if (remove != null) {
            IEg.A0O.A0I.remove(remove);
        }
        map.clear();
    }
}
