package X;

import android.net.Uri;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.enums.GraphQLStickerState;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.stickers.model.Sticker;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4sc.class */
public class C10074sc implements 2Et {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final int A06;
    public final 2Hb A07;
    public final LinkedHashMap A08;
    public final int A09;
    public final C00i A0A;

    public C10074sc(2Hb r302, C00i c00i, int i, int i2, int i3) {
        11T.A0F(c00i, 5);
        this.A09 = i;
        this.A03 = i2;
        if (i2 <= 0) {
            throw AnonymousClass001.A0L(AnonymousClass000.A00(208));
        }
        this.A08 = new LinkedHashMap(0, 0.75f, true);
        this.A07 = r302;
        this.A0A = c00i;
        this.A06 = i3;
    }

    private final int A00() {
        int size;
        synchronized (this) {
            size = this.A08.size();
        }
        return size;
    }

    public static final int A01(C10074sc c10074sc, Object obj, Object obj2) {
        int i;
        int i2;
        String path;
        String path2;
        String path3;
        String path4;
        String path5;
        String path6;
        String path7;
        String path8;
        String name;
        String name2;
        if (c10074sc instanceof 69L) {
            Sticker sticker = (Sticker) obj2;
            int length = ((String) obj).length();
            if (sticker == null) {
                i2 = 0;
            } else {
                int length2 = sticker.A0F.length() + sticker.A0H.length();
                String str = sticker.A0G;
                int i3 = 0;
                int length3 = length2 + (str != null ? str.length() : 0);
                String str2 = sticker.A0D;
                int length4 = length3 + (str2 != null ? str2.length() : 0);
                String str3 = sticker.A0E;
                int length5 = length4 + (str3 != null ? str3.length() : 0) + 4;
                GraphQLStickerState graphQLStickerState = sticker.A0A;
                int length6 = length5 + ((graphQLStickerState == null || (name2 = graphQLStickerState.name()) == null) ? 0 : name2.length());
                GraphQLStickerType graphQLStickerType = sticker.A0B;
                int length7 = length6 + ((graphQLStickerType == null || (name = graphQLStickerType.name()) == null) ? 0 : name.length());
                String path9 = sticker.A09.getPath();
                int length8 = length7 + (path9 != null ? path9.length() : 0);
                Uri uri = sticker.A08;
                int length9 = length8 + ((uri == null || (path8 = uri.getPath()) == null) ? 0 : path8.length());
                Uri uri2 = sticker.A02;
                int length10 = length9 + ((uri2 == null || (path7 = uri2.getPath()) == null) ? 0 : path7.length());
                Uri uri3 = sticker.A01;
                int length11 = length10 + ((uri3 == null || (path6 = uri3.getPath()) == null) ? 0 : path6.length());
                Uri uri4 = sticker.A07;
                int length12 = length11 + ((uri4 == null || (path5 = uri4.getPath()) == null) ? 0 : path5.length());
                Uri uri5 = sticker.A06;
                int length13 = length12 + ((uri5 == null || (path4 = uri5.getPath()) == null) ? 0 : path4.length());
                Uri uri6 = sticker.A04;
                int length14 = length13 + ((uri6 == null || (path3 = uri6.getPath()) == null) ? 0 : path3.length());
                Uri uri7 = sticker.A03;
                int length15 = length14 + ((uri7 == null || (path2 = uri7.getPath()) == null) ? 0 : path2.length());
                Uri uri8 = sticker.A05;
                if (uri8 != null && (path = uri8.getPath()) != null) {
                    i3 = path.length();
                }
                i2 = length15 + i3 + 28;
            }
            i = length + i2;
            if (i < 0) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Negative size: ");
                A0k.append(obj);
                A0k.append('=');
                throw AnonymousClass002.A0E(obj2, A0k);
            }
        } else {
            i = 1;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        if (r0.size() > r303) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A02(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10074sc.A02(int, int):void");
    }

    public static final void A03(C10074sc c10074sc, int i) {
        2Hb r0 = c10074sc.A07;
        long j = i;
        Integer num = 0S2.A0C;
        if (2Hb.A01(r0)) {
            ((2Ct) r0.A01.get()).A06(r0.A02(num), j);
        }
        long A00 = c10074sc.A00();
        Integer num2 = 0S2.A0N;
        if (2Hb.A01(r0)) {
            ((2Ct) r0.A01.get()).A06(r0.A02(num2), A00);
        }
        if (c10074sc.A00() <= 0) {
            C00i c00i = c10074sc.A0A;
            c00i.get();
            r0.A02(num);
            c00i.get();
            r0.A02(num2);
            return;
        }
        int i2 = c10074sc.A06;
        C00i c00i2 = c10074sc.A0A;
        if (i2 == 1) {
            c00i2.get();
            r0.A02(num);
        } else {
            c00i2.get();
            r0.A02(num2);
            c10074sc.A00();
        }
    }

    public static final void A04(C10074sc c10074sc, int i) {
        int i2;
        03Y A1G;
        Object obj;
        synchronized (c10074sc) {
            i2 = c10074sc.A01;
        }
        if (i2 > i) {
            int i3 = 0;
            do {
                synchronized (c10074sc) {
                    int i4 = c10074sc.A01;
                    if (i4 >= 0) {
                        LinkedHashMap linkedHashMap = c10074sc.A08;
                        if (!linkedHashMap.isEmpty() || i4 == 0) {
                            if ((i3 < 0 || i4 > i) && !linkedHashMap.isEmpty()) {
                                Object next = AnonymousClass001.A0x(linkedHashMap).next();
                                11T.A0A(next);
                                Map.Entry entry = (Map.Entry) next;
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                linkedHashMap.remove(key);
                                int A01 = c10074sc.A01 - A01(c10074sc, key, value);
                                c10074sc.A01 = A01;
                                A03(c10074sc, A01);
                                c10074sc.A00++;
                                i3++;
                                A1G = 1BK.A1G(key, value);
                            } else {
                                new 03Y((Object) null, (Object) null);
                            }
                        }
                    }
                    throw 1BK.A0i(AnonymousClass001.A0Y(c10074sc), 1BJ.A00(623));
                }
                Object obj2 = A1G.first;
                obj = A1G.second;
                if (obj2 == null) {
                    break;
                }
            } while (obj != null);
            2Hb r0 = c10074sc.A07;
            2Hb.A00(r0, 0S2.A0Y, 1L);
            2Hb.A00(r0, 0S2.A0j, i3);
            2Hb.A00(r0, 0S2.A0u, 0L);
        }
    }

    public final Object A05(Object obj) {
        if (obj == null) {
            throw AnonymousClass001.A0Q("key == null");
        }
        synchronized (this) {
            Object obj2 = this.A08.get(obj);
            if (obj2 != null) {
                this.A02++;
                2Hb.A00(this.A07, 0S2.A00, 1L);
                return obj2;
            }
            this.A04++;
            2Hb.A00(this.A07, 0S2.A01, 1L);
            return null;
        }
    }

    public final void A06(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw AnonymousClass001.A0Q(1BJ.A00(1456));
        }
        synchronized (this) {
            this.A05++;
            this.A01 += A01(this, obj, obj2);
            Object put = this.A08.put(obj, obj2);
            if (put != null) {
                this.A01 -= A01(this, obj, put);
            }
            A03(this, this.A01);
        }
        A02(this.A03, this.A09);
    }

    public void D5F(45Z r302) {
        11T.A0F(r302, 0);
        if (r302 != 45Z.A01) {
            A02((-1) >>> 1, (int) ((1.0d - r302.mSuggestedTrimRatio) * A00()));
        }
    }

    public String toString() {
        String formatStrLocaleSafe;
        synchronized (this) {
            int i = this.A02;
            int i2 = this.A04;
            int i3 = i2 + i;
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(1BJ.A00(782), Integer.valueOf(this.A03), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3 != 0 ? (i * 100) / i3 : 0));
            11T.A0A(formatStrLocaleSafe);
        }
        return formatStrLocaleSafe;
    }
}
