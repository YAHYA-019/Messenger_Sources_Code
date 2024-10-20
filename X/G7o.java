package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import libraries.access.src.main.base.common.FXDeviceItem;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: G7o.class */
public final class G7o implements GJx {
    public static void A00(String str) {
        if (!str.equals("FXAccountItemEligibilityEligible") && !str.equals("FXAccountItemEligibilityIneligible") && !str.equals("FXAccountItemEligibilityNoData")) {
            throw AnonymousClass001.A0L(str);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v8 java.lang.String, still in use, count: 2, list:
          (r314v8 java.lang.String) from 0x00ba: PHI (r314v2 java.lang.String) = (r314v1 java.lang.String), (r314v8 java.lang.String) binds: [B:65:0x00b6, B:19:0x00a4] A[DONT_GENERATE, DONT_INLINE]
          (r314v8 java.lang.String) from 0x00a4: IF  (r314v8 java.lang.String) != (null java.lang.String)  -> B:28:0x00ba A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Type inference failed for: r0v85, types: [X.67b, java.lang.Object] */
    @Override // X.GJx
    public X.C67b D4t(android.database.Cursor r302) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G7o.D4t(android.database.Cursor):X.67b");
    }

    @Override // X.GJx
    public ExG D4v(Cursor cursor, C67Z c67z, EMr eMr) {
        String str;
        11T.A0G(c67z, 1, eMr);
        try {
            String string = cursor.getString(1);
            if (string == null) {
                return null;
            }
            JSONObject A1F = DKC.A1F(string);
            str = "";
            return new ExG(A1F.has("userId") ? A1F.getString("userId") : str, A1F.has("accessToken") ? A1F.getString("accessToken") : "", c67z.name(), new G8a(A1F, 11), c67z, eMr);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.GJx
    public ExG D4w(Cursor cursor, EMr eMr) {
        11T.A0F(eMr, 1);
        int columnIndex = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex2 = cursor.getColumnIndex("COL_USER_ID");
        int columnIndex3 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex4 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex5 = cursor.getColumnIndex("COL_SESSION_ID");
        int columnIndex6 = cursor.getColumnIndex("COL_UPSELL_HOLDOUT_STATUS");
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1 || columnIndex5 == -1) {
            throw new RuntimeException("Column not found.");
        }
        String string = cursor.getString(columnIndex2);
        String string2 = cursor.getString(columnIndex5);
        if (string == null || string2 == null) {
            throw null;
        }
        return new ExG(string, string2, "INSTAGRAM", new G8a(cursor, columnIndex3, columnIndex4, columnIndex6), C67Z.INSTAGRAM, eMr);
    }

    @Override // X.GJx
    public FXDeviceItem D4y(Cursor cursor, EMS ems, 67T r304) {
        int columnIndex = cursor.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (columnIndex != -1) {
            return new FXDeviceItem(null, cursor.getString(columnIndex), C67Z.INSTAGRAM, ems);
        }
        throw new RuntimeException("Column not found.");
    }
}
