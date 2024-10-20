package X;

/* loaded from: Cls.class */
public final class Cls implements JEv {
    public final int A00;
    public final Object A01;

    public Cls(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        r0.A02 = r302;
        r0.A1a();
     */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.fragment.app.Fragment, X.Alu] */
    @Override // X.JEv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C8d(com.facebook.messaging.location.model.NearbyPlace r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L67
            r0 = r301
            java.lang.Object r0 = r0.A01
            com.facebook.messaging.location.addresspicker.AddressPickerLocationDialogFragment r0 = (com.facebook.messaging.location.addresspicker.AddressPickerLocationDialogFragment) r0
            r304 = r0
            r0 = r304
            X.Bfz r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L41
            r0 = r305
            X.Bg0 r0 = r0.A00
            X.B7C r0 = r0.A00
            r306 = r0
            r0 = r306
            com.facebook.messaging.location.model.NearbyPlace r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L59
            r0 = r302
            if (r0 == 0) goto L41
        L36:
            r0 = r306
            r1 = r302
            r0.A02 = r1
            r0 = r306
            r0.A1a()
        L41:
            r0 = r304
            android.view.inputmethod.InputMethodManager r0 = r0.A00
            r306 = r0
            r0 = r304
            android.view.View r0 = r0.mView
            r305 = r0
            r0 = r305
            r1 = r306
            X.7zR.A12(r0, r1)
            r0 = r304
            r0.A0p()
        L58:
            return
        L59:
            r0 = r305
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L36
            goto L41
        L67:
            r0 = r302
            if (r0 == 0) goto L58
            r0 = r301
            java.lang.Object r0 = r0.A01
            X.Alu r0 = (X.C1575Alu) r0
            r304 = r0
            int r0 = X.C1575Alu.A0B
            r303 = r0
            r0 = r304
            X.CNk r0 = r0.A02
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L8b
            java.lang.String r0 = "eventsCreationLocationUiModel"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L8b:
            r0 = r306
            r1 = r302
            r2 = 0
            X.CNk.A01(r0, r1, r2)
            r0 = r304
            X.06Z r0 = r0.getParentFragmentManager()
            r304 = r0
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            r306 = r0
            r0 = r304
            java.lang.String r1 = "request_key_location_submitted"
            r2 = r306
            r0.A1R(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cls.C8d(com.facebook.messaging.location.model.NearbyPlace):void");
    }
}
