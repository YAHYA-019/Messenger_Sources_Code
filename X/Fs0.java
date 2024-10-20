package X;

import androidx.lifecycle.LiveData;
import kotlin.jvm.functions.Function1;

/* loaded from: Fs0.class */
public final class Fs0 implements MIi {
    public final int A00;
    public final Object A01;

    public Fs0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.MIi
    public void Buf() {
        Function1 function1;
        Object obj;
        int i = this.A00;
        Object obj2 = this.A01;
        switch (i) {
            case 0:
                function1 = (Function1) obj2;
                obj = "Id Detector Model failed to download";
                break;
            case 1:
                function1 = (Function1) obj2;
                obj = "Ocr Model failed to download";
                break;
            default:
                ((LiveData) obj2).setValue(FJC.A06(AnonymousClass001.A0T("Failed to download card binary")));
                return;
        }
        function1.invoke(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r0.length() != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r302 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        ((kotlin.jvm.functions.Function1) r301.A01).invoke(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.MIi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void Bus(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            switch(r0) {
                case 0: goto L44;
                case 1: goto L31;
                default: goto L1c;
            }
        L1c:
            r0 = r301
            java.lang.Object r0 = r0.A01
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            r304 = r0
            r0 = 0
            X.FJC r0 = X.FJC.A04(r0)
            r305 = r0
            r0 = r304
            r1 = r305
            r0.setValue(r1)
            return
        L31:
            r0 = r302
            if (r0 == 0) goto L56
        L35:
            r0 = r301
            java.lang.Object r0 = r0.A01
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r1 = 0
            java.lang.Object r0 = r0.invoke(r1)
            return
        L44:
            r0 = r302
            java.lang.String r0 = (java.lang.String) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L56
            r0 = r302
            int r0 = r0.length()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L35
        L56:
            r0 = r301
            r0.Buf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fs0.Bus(java.lang.Object):void");
    }
}
