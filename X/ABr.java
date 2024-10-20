package X;

import androidx.core.view.inputmethod.InputContentInfoCompat;

/* loaded from: ABr.class */
public final class ABr implements 1K9 {
    public final /* synthetic */ 6RU A00;
    public final /* synthetic */ 7CG A01;
    public final /* synthetic */ boolean A02;

    public ABr(6RU r302, 7CG r303, boolean z) {
        this.A01 = r303;
        this.A02 = z;
        this.A00 = r302;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:9:0x0045
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public void onFailure(java.lang.Throwable r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            X.7CG r0 = r0.A01
            r303 = r0
            r0 = r303
            androidx.core.view.inputmethod.InputContentInfoCompat r0 = r0.A01
            r304 = r0
            r0 = r303
            int r0 = r0.A00
            r1 = 1
            r0 = r0 & r1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L20
            r0 = r304
            r0.releasePermission()     // Catch: java.lang.Exception -> L45
        L20:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()     // Catch: java.lang.Exception -> L45
            r306 = r0
            r0 = r306
            java.lang.String r1 = "Error converting commit content uri "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r304
            android.net.Uri r0 = r0.getContentUri()
            r1 = r306
            java.lang.String r0 = X.AnonymousClass001.A0a(r0, r1)
            r306 = r0
            r0 = 229(0xe5, float:3.21E-43)
            java.lang.String r0 = X.4YT.A00(r0)
            r1 = r306
            r2 = r302
            X.0fH.A0r(r0, r1, r2)
            return
        L45:
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ABr.onFailure(java.lang.Throwable):void");
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        7DE r303;
        C5fp c5fp = (C5fp) obj;
        7CG r0 = this.A01;
        InputContentInfoCompat inputContentInfoCompat = r0.A01;
        if ((r0.A00 & 1) != 0) {
            try {
                inputContentInfoCompat.releasePermission();
            } catch (Exception unused) {
            }
        }
        if (c5fp == null) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Error converting commit content uri ");
            0fH.A0k(4YT.A00(229), AnonymousClass001.A0a(inputContentInfoCompat.getContentUri(), A0k));
            return;
        }
        boolean z = this.A02;
        6RU r02 = this.A00;
        if (z) {
            r303 = new 7DE(new C5ft(c5fp).A01);
        } else {
            String str = c5fp.A0B;
            if (str == null) {
                str = 4YU.A0s();
                c5fp.A0B = str;
            }
            7Gc r03 = new 7Gc();
            r03.A02("image");
            r03.A03("composer_input_content");
            r03.A00(str.hashCode());
            7FI.A02(r02, new 7AT(r03));
            r303 = new 7Ad(c5fp, "unknown", (String) null);
        }
        7FI.A02(r02, r303);
    }
}
