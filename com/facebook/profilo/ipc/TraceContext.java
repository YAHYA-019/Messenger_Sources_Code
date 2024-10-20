package com.facebook.profilo.ipc;

import X.03R;
import X.0qE;
import X.C0ld;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.io.File;

/* loaded from: TraceContext.class */
public final class TraceContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 0qE(4);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C0ld A07;
    public TraceConfigExtras A08;
    public Buffer A09;
    public File A0A;
    public Object A0B;
    public Object A0C;
    public String A0D;
    public String A0E;
    public Buffer[] A0F;
    public volatile 03R A0G;

    public TraceContext() {
    }

    public TraceContext(C0ld c0ld, TraceConfigExtras traceConfigExtras, Buffer buffer, File file, Object obj, Object obj2, String str, String str2, Buffer[] bufferArr, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        this.A06 = j;
        this.A0D = str;
        this.A07 = c0ld;
        this.A01 = i;
        this.A0C = obj;
        this.A0B = obj2;
        this.A05 = j2;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A04 = i5;
        this.A08 = traceConfigExtras;
        this.A09 = buffer;
        this.A0F = bufferArr;
        this.A0A = file;
        this.A0E = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TraceContext(com.facebook.profilo.ipc.TraceContext r302) {
        /*
            r301 = this;
            r0 = r302
            r303 = r0
            r0 = r302
            long r0 = r0.A06
            r304 = r0
            r0 = r302
            java.lang.String r0 = r0.A0D
            r306 = r0
            r0 = r302
            X.0ld r0 = r0.A07
            r307 = r0
            r0 = r302
            int r0 = r0.A01
            r308 = r0
            r0 = r302
            java.lang.Object r0 = r0.A0C
            r309 = r0
            r0 = r302
            java.lang.Object r0 = r0.A0B
            r310 = r0
            r0 = r302
            long r0 = r0.A05
            r311 = r0
            r0 = r302
            int r0 = r0.A02
            r313 = r0
            r0 = r302
            int r0 = r0.A03
            r314 = r0
            r0 = r302
            int r0 = r0.A00
            r315 = r0
            r0 = r302
            int r0 = r0.A04
            r316 = r0
            r0 = r302
            com.facebook.profilo.ipc.TraceConfigExtras r0 = r0.A08
            r317 = r0
            r0 = r302
            com.facebook.profilo.mmapbuf.core.Buffer r0 = r0.A09
            r318 = r0
            r0 = r302
            com.facebook.profilo.mmapbuf.core.Buffer[] r0 = r0.A0F
            r319 = r0
            r0 = r302
            java.io.File r0 = r0.A0A
            r320 = r0
            r0 = r302
            java.lang.String r0 = r0.A0E
            r303 = r0
            r0 = r306
            r321 = r0
            r0 = r317
            r306 = r0
            r0 = r301
            r1 = r307
            r2 = r317
            r3 = r318
            r4 = r320
            r5 = r309
            r6 = r310
            r7 = r321
            r8 = r303
            r9 = r319
            r10 = r308
            r11 = r313
            r12 = r314
            r13 = r315
            r14 = r316
            r15 = r304
            r16 = r311
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.ipc.TraceContext.<init>(com.facebook.profilo.ipc.TraceContext):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TraceContext(com.facebook.profilo.ipc.TraceContext r302, int r303) {
        /*
            r301 = this;
            r0 = r302
            r304 = r0
            r0 = r302
            long r0 = r0.A06
            r305 = r0
            r0 = r302
            java.lang.String r0 = r0.A0D
            r307 = r0
            r0 = r302
            X.0ld r0 = r0.A07
            r308 = r0
            r0 = r302
            int r0 = r0.A01
            r309 = r0
            r0 = r302
            java.lang.Object r0 = r0.A0C
            r310 = r0
            r0 = r302
            java.lang.Object r0 = r0.A0B
            r311 = r0
            r0 = r302
            long r0 = r0.A05
            r312 = r0
            r0 = r302
            int r0 = r0.A02
            r314 = r0
            r0 = r302
            int r0 = r0.A03
            r315 = r0
            r0 = r302
            int r0 = r0.A04
            r316 = r0
            r0 = r302
            com.facebook.profilo.ipc.TraceConfigExtras r0 = r0.A08
            r317 = r0
            r0 = r302
            com.facebook.profilo.mmapbuf.core.Buffer r0 = r0.A09
            r318 = r0
            r0 = r302
            com.facebook.profilo.mmapbuf.core.Buffer[] r0 = r0.A0F
            r319 = r0
            r0 = r302
            java.io.File r0 = r0.A0A
            r320 = r0
            r0 = r302
            java.lang.String r0 = r0.A0E
            r304 = r0
            r0 = r307
            r321 = r0
            r0 = r308
            r307 = r0
            r0 = r301
            r1 = r308
            r2 = r317
            r3 = r318
            r4 = r320
            r5 = r310
            r6 = r311
            r7 = r321
            r8 = r304
            r9 = r319
            r10 = r309
            r11 = r314
            r12 = r315
            r13 = r303
            r14 = r316
            r15 = r305
            r16 = r312
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.ipc.TraceContext.<init>(com.facebook.profilo.ipc.TraceContext, int):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        this.A08.writeToParcel(parcel, i);
    }
}
