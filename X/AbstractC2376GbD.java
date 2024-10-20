package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.locationsharing.core.models.LiveLocationSharer;
import com.facebook.locationsharing.core.models.Location;
import com.facebook.locationsharing.core.models.LocationSharingPresenterState;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.GbD, reason: case insensitive filesystem */
/* loaded from: GbD.class */
public abstract class AbstractC2376GbD extends HZX {
    public static final List A07 = AnonymousClass001.A0s();
    public Htm A00;
    public boolean A01;
    public final HuU A02;
    public final List A03;
    public final I76 A04;
    public final String A05;
    public final JDx A06;

    public AbstractC2376GbD(HuU huU, JDx jDx, JDy jDy, I76 i76, String str) {
        super(jDy);
        this.A03 = AnonymousClass001.A0s();
        this.A04 = i76;
        this.A02 = huU;
        this.A06 = jDx;
        this.A05 = TextUtils.isEmpty(str) ? "PresenterBase" : str;
        A0B("init", AnonymousClass001.A1Z());
    }

    public static ImmutableMap A04(ImmutableList immutableList) {
        int size = immutableList.size();
        1Fg.A00(size, 1BJ.A00(405));
        ImmutableMap.Builder builder = new ImmutableMap.Builder(size);
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            LiveLocationSharer liveLocationSharer = (LiveLocationSharer) it.next();
            builder.put(liveLocationSharer.A04, liveLocationSharer);
        }
        return builder.build();
    }

    public static void A05(HAO hao, AbstractC2376GbD abstractC2376GbD, String str, Throwable th, Object... objArr) {
        JDx jDx = abstractC2376GbD.A06;
        if (jDx != null) {
            Thread currentThread = Thread.currentThread();
            Thread A10 = DKD.A10();
            String A0j = 0Pz.A0j(String.format(Locale.US, str, objArr), " thread=", currentThread.getName());
            String str2 = abstractC2376GbD.A05;
            jDx.BZO(hao, str2, A0j, th);
            if (abstractC2376GbD.A01 || currentThread.getId() == A10.getId()) {
                return;
            }
            jDx.BZO(HAO.A06, str2, "Not running in main thread.", null);
            abstractC2376GbD.A01 = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0169, code lost:
    
        if (r303.equals("SHARER_SELECTED") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x017d, code lost:
    
        if (r303.equals("CURRENT_TIME_UPDATED") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0191, code lost:
    
        if (r303.equals("POINTS_OF_INTEREST_SELECTED") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x01bc, code lost:
    
        if (r303.equals("SHARERS_UPDATED") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0218, code lost:
    
        if (r303.equals("ERROR") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x022c, code lost:
    
        if (r303.equals("MAP_MOVED") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0288, code lost:
    
        if (r303.equals("MAP_CENTERED") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:105:0x02ab. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0067. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x095c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0c36  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0cc2 A[LOOP:2: B:71:0x0cb4->B:73:0x0cc2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0d7f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0dab A[LOOP:3: B:79:0x0d9d->B:81:0x0dab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0ddf  */
    /* JADX WARN: Type inference failed for: r0v345, types: [com.facebook.locationsharing.core.models.Address] */
    /* JADX WARN: Type inference failed for: r0v361, types: [com.facebook.locationsharing.core.models.Address] */
    /* JADX WARN: Type inference failed for: r1v69, types: [com.facebook.locationsharing.core.models.Address] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(X.AbstractC2376GbD r301, java.lang.Object r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 3593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2376GbD.A06(X.GbD, java.lang.Object, java.lang.String):void");
    }

    public void A07() {
        A0B("detach", new Object[0]);
        if (((HZX) this).A00) {
            this.A02.A04();
        }
        this.A00 = null;
        ((HZX) this).A00 = false;
    }

    public void A08() {
        A0B("refresh", AnonymousClass001.A1Z());
    }

    public void A09() {
        A0B("suspend", AnonymousClass001.A1Z());
    }

    public void A0A(Bundle bundle) {
        Location location;
        Parcelable parcelable;
        ((HZX) this).A00 = true;
        A0B("attach", new Object[0]);
        Htm htm = (bundle == null || (parcelable = bundle.getParcelable("location_sharing_presenter_state")) == null) ? null : new Htm(C2375GbC.A0M, parcelable, null, false);
        A0B("restored_state=%s", htm);
        if (htm == null) {
            C2375GbC c2375GbC = (C2375GbC) this;
            I0L i0l = new I0L();
            i0l.A01 = System.currentTimeMillis();
            i0l.A0D = false;
            String str = c2375GbC.A0F;
            i0l.A0C = str;
            C1pq.A08("userId", str);
            Hos hos = c2375GbC.A04;
            if (hos instanceof C2721Gm9) {
                try {
                    location = HHy.A00(LBf.A02((C5ez) ((C2721Gm9) hos).A03.get(), 0Pz.A0W("MessengerLocationFacade:", "LocationSharingPresenter"), -721294198, 600000L, false));
                } catch (HCv unused) {
                    location = null;
                }
            } else {
                location = null;
            }
            i0l.A04 = location;
            htm = new Htm(C2375GbC.A0M, new LocationSharingPresenterState(i0l), null, false);
        }
        this.A00 = htm;
        this.A02.A05();
    }

    public final void A0B(String str, Object... objArr) {
        A05(HAO.A02, this, str, null, objArr);
    }
}
