package X;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.ipc.media.MediaItem;
import com.facebook.ipc.media.data.MimeType;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Iek.class */
public final class Iek implements JOF {
    public 2EU A00;
    public final 1Br A02 = 1Bu.A00(116314);
    public final 1Br A01 = AbG.A0M();
    public final 1Br A04 = AbG.A0I();
    public final java.util.Map A03 = DKD.A13();
    public final Object A06 = AnonymousClass001.A0R();
    public final Closeable A05 = new S69(this);

    public void AGJ(2EU r302) {
        11T.A0F(r302, 0);
        synchronized (this.A06) {
            if (r302.A0A()) {
                r302.close();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v138, types: [X.0ty] */
    public List ASG(Cursor cursor, int i, boolean z, boolean z2) {
        ArrayList A0t;
        synchronized (this) {
            I72 i72 = (I72) 1Br.A0B(this.A02);
            java.util.Map map = this.A03;
            11T.A09(map);
            if (i <= 0) {
                A0t = C0ty.A00;
            } else {
                ArrayList A0s = AnonymousClass001.A0s();
                ArrayList A0s2 = AnonymousClass001.A0s();
                ArrayList A0s3 = AnonymousClass001.A0s();
                ArrayList A0t2 = AnonymousClass001.A0t(i);
                A0t = AnonymousClass001.A0t(i);
                if (cursor.getPosition() < -1) {
                    cursor.moveToPosition(-1);
                }
                while (cursor.moveToNext() && cursor.getPosition() < i) {
                    Long valueOf = Long.valueOf(cursor.getLong(0));
                    A0t2.add(valueOf);
                    if (!map.containsKey(valueOf)) {
                        if (cursor.getString(0).equals(MimeType.A00.mRawType)) {
                            A0s2.add(valueOf);
                            IEb iEb = (IEb) 1Br.A0B(i72.A00);
                            ICu iCu = IEb.A07;
                            MediaItem A09 = iEb.A09(new RLs(cursor, (Uri) null, false), (String) null, (String) null, true, true);
                            if (A09 != null) {
                                map.put(Long.valueOf(A09.A00.mMediaStoreId), A09);
                            }
                        } else if (cursor.getInt(1) == 3) {
                            A0s3.add(valueOf);
                        } else {
                            A0s.add(valueOf);
                        }
                    }
                }
                if (7zM.A1b(A0s)) {
                    String A00 = I72.A00(A0s);
                    IEb iEb2 = (IEb) 1Br.A0B(i72.A00);
                    Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    11T.A0B(uri);
                    I72.A01(iEb2.A05(uri, A00, (String[]) null), i72, map, false, false);
                }
                if (7zM.A1b(A0s3)) {
                    String A002 = I72.A00(A0s3);
                    IEb iEb3 = (IEb) 1Br.A0B(i72.A00);
                    Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    11T.A0B(uri2);
                    I72.A01(iEb3.A06(uri2, A002, (String[]) null), i72, map, false, z2);
                }
                Iterator it = A0t2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    A0t.add(map.containsKey(next) ? map.get(next) : null);
                }
            }
        }
        return A0t;
    }

    public 2EU Aad() {
        2EU A02;
        synchronized (this.A06) {
            2EU r0 = this.A00;
            if (r0 == null || !r0.A0A()) {
                A02 = 2EU.A02(this.A05);
                this.A00 = A02;
                11T.A0I(A02, "null cannot be cast to non-null type com.facebook.common.references.CloseableReference<java.io.Closeable>");
            } else {
                2EU r02 = this.A00;
                if (r02 == null) {
                    throw 1BK.A0h();
                }
                A02 = r02.A07();
            }
        }
        return A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r302.getInt(1) != 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (r302.getString(0).equals(com.facebook.ipc.media.data.MimeType.A00.mRawType) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.ipc.media.MediaItem AwC(android.database.Cursor r302, int r303, int r304, long r305, boolean r307) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Iek.AwC(android.database.Cursor, int, int, long, boolean):com.facebook.ipc.media.MediaItem");
    }
}
