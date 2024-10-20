package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;

/* loaded from: K0I.class */
public final class K0I extends 6W7 implements Handler.Callback {
    public int A00;
    public int A01;
    public List A02;
    public long A03;
    public MFx A04;
    public boolean A05;
    public final Handler A06;
    public final C6X6 A07;
    public final Metadata[] A08;
    public final 6X7 A09;
    public final 6XA A0A;
    public final long[] A0B;

    public K0I(Looper looper, 6X7 r303, C6X6 c6x6, String str) {
        super(5);
        c6x6.getClass();
        this.A07 = c6x6;
        this.A06 = looper == null ? null : new Handler(looper, this);
        r303.getClass();
        this.A09 = r303;
        this.A0A = new 6WD(1);
        this.A08 = new Metadata[5];
        this.A0B = new long[5];
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.A02 = R3e.A00(str);
        } catch (JSONException unused) {
            5My.A02("MetadataRenderer", "Error in parsing IMF spec");
        }
    }

    private void A00(Metadata metadata, List list) {
        int i = 0;
        while (true) {
            int i2 = i;
            Metadata.Entry[] entryArr = metadata.A01;
            if (i2 >= entryArr.length) {
                return;
            }
            6Yl BL2 = entryArr[i2].BL2();
            if (BL2 != null) {
                6X7 r0 = this.A09;
                if (r0.D3d(BL2)) {
                    Lb0 AJU = r0.AJU(BL2);
                    byte[] BL1 = entryArr[i2].BL1();
                    BL1.getClass();
                    6XA r02 = this.A0A;
                    r02.A00();
                    r02.A02(BL1.length);
                    ((6WD) r02).A02.put(BL1);
                    r02.A01();
                    Metadata ALf = AJU.ALf(r02);
                    if (ALf != null) {
                        A00(ALf, list);
                    }
                    i = i2 + 1;
                }
            }
            list.add(entryArr[i2]);
            i = i2 + 1;
        }
    }

    public void A0O() {
        Arrays.fill(this.A08, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = null;
    }

    public void A0P(long j, boolean z) {
        Arrays.fill(this.A08, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
    }

    public void A0R(6Yl[] r302, long j, long j2) {
        this.A04 = this.A09.AJU(r302[0]);
    }

    public boolean BSB() {
        return this.A05;
    }

    public boolean BVE() {
        return true;
    }

    public void CfO(long j, long j2) {
        List list = this.A02;
        if (list != null) {
            UUID uuid = 6Za.A04;
            long A0C = Util.A0C(j);
            Handler handler = this.A06;
            if (handler != null) {
                4YU.A1G(handler, Long.valueOf(A0C), 1);
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        if (!this.A05 && this.A00 < 5) {
            6XA r0 = this.A0A;
            r0.A00();
            6WB r02 = ((6W7) this).A0C;
            r02.A01 = null;
            r02.A00 = null;
            int A0I = A0I(r02, r0, 0);
            if (A0I == -4) {
                int i = ((6WE) r0).A00;
                if ((i & 4) == 4) {
                    this.A05 = true;
                } else {
                    int i2 = (-1) << (-1);
                    if ((i & i2) != i2) {
                        r0.A00 = this.A03;
                        r0.A01();
                        Metadata ALf = this.A04.ALf(r0);
                        if (ALf != null) {
                            ArrayList A0t = AnonymousClass001.A0t(ALf.A01.length);
                            A00(ALf, A0t);
                            if (!A0t.isEmpty()) {
                                Metadata metadata = new Metadata(A0t);
                                int i3 = this.A01;
                                int i4 = this.A00;
                                int i5 = (i3 + i4) % 5;
                                this.A08[i5] = metadata;
                                this.A0B[i5] = ((6WD) r0).A01;
                                this.A00 = i4 + 1;
                            }
                        }
                    }
                }
            } else if (A0I == -5) {
                6Yl r03 = r02.A00;
                r03.getClass();
                this.A03 = r03.A0M;
            }
        }
        if (this.A00 > 0) {
            long[] jArr = this.A0B;
            int i6 = this.A01;
            long j3 = jArr[i6];
            if (j3 <= j) {
                Metadata[] metadataArr = this.A08;
                Metadata metadata2 = metadataArr[i6];
                long j4 = j - j3;
                UUID uuid2 = 6Za.A04;
                long A0C2 = Util.A0C(j4);
                Handler handler2 = this.A06;
                if (handler2 != null) {
                    4YU.A1G(handler2, GOo.A1b(metadata2, A0C2), 0);
                } else {
                    this.A07.C7C(metadata2, A0C2);
                }
                int i7 = this.A01;
                metadataArr[i7] = null;
                this.A01 = (i7 + 1) % 5;
                this.A00--;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r0 == 2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int D3b(X.6Yl r302) {
        /*
            r301 = this;
            r0 = r301
            X.6X7 r0 = r0.A09
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.D3d(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L33
            r0 = r302
            int r0 = r0.A07
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L27
            r0 = 2
            r304 = r0
            r0 = 2
            r306 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L2a
        L27:
            r0 = 4
            r306 = r0
        L2a:
            r0 = r306
            r1 = 0
            r0 = r0 | r1
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 | r1
            return r0
        L33:
            r0 = 0
            r306 = r0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K0I.D3b(X.6Yl):int");
    }

    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Object[] objArr = (Object[]) message.obj;
            this.A07.C7C((Metadata) objArr[0], AnonymousClass001.A05(objArr[1]));
        } else {
            if (i != 1) {
                throw JQx.A0o();
            }
            List list = this.A02;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        return true;
    }
}
