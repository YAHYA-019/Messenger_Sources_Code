package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Process;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fblibraries.fblogin.FirstPartySsoSessionInfo;
import com.facebook.fblibraries.fblogin.SsoSource;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4DT, reason: invalid class name */
/* loaded from: 4DT.class */
public abstract class C4DT {
    public static FirstPartySsoSessionInfo A00(Account account, Context context, SsoSource ssoSource) {
        context.checkPermission("android.permission.AUTHENTICATE_ACCOUNTS", Process.myPid(), Process.myUid());
        try {
            String userData = AccountManager.get(context).getUserData(account, "sso_data");
            if (userData == null) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(userData);
                String string = jSONObject.getString("userId");
                String string2 = jSONObject.getString("accessToken");
                String string3 = jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                String string4 = jSONObject.has("userName") ? jSONObject.getString("userName") : null;
                String string5 = jSONObject.has("profilePicUrl") ? jSONObject.getString("profilePicUrl") : null;
                Iterator<String> keys = jSONObject.keys();
                AbstractMap abstractMap = null;
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.startsWith("customKey")) {
                        String string6 = jSONObject.getString(next);
                        String substring = next.substring(9);
                        if (abstractMap == null) {
                            new HashMap();
                        }
                        abstractMap.put(substring, string6);
                    }
                }
                return new FirstPartySsoSessionInfo(ssoSource, string, string3, string2, string4, string5, abstractMap);
            } catch (JSONException e) {
                0fH.A0r("UnifiedSsoLoginUtil", "Invalid data associated with account", e);
                return null;
            }
        } catch (SecurityException e2) {
            0fH.A0r("UnifiedSsoLoginUtil", "Could not read SSO session info from account's user data", e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A01(android.content.ContentResolver r301, java.lang.String r302, java.lang.String r303, java.lang.String r304) {
        /*
            java.lang.String r0 = "UnifiedSsoLoginUtil"
            r305 = r0
            r0 = r302
            r1 = r305
            java.lang.String r2 = "Using content provider URI for %s"
            X.0fH.A0h(r0, r1, r2)
            java.lang.String r0 = ".provider."
            r306 = r0
            java.lang.String r0 = "content://"
            r1 = r302
            r2 = r306
            r3 = r303
            java.lang.String r4 = "/user_values"
            java.lang.String r0 = X.0Pz.A0z(r0, r1, r2, r3, r4)
            android.net.Uri r0 = X.C0A2.A03(r0)
            r307 = r0
            java.lang.String r0 = "value"
            r308 = r0
            r0 = 1
            r309 = r0
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "name"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r308
            r1[r2] = r3
            r310 = r0
            r0 = -442936304(0xffffffffe5995410, float:-9.050909E22)
            r311 = r0
            r0 = r301
            r1 = r307
            r2 = r304
            r3 = 0
            r4 = r310
            r5 = 0
            r6 = r311
            android.database.Cursor r0 = X.0L0.A01(r0, r1, r2, r3, r4, r5, r6)
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L77
            r0 = r312
            boolean r0 = r0.moveToNext()     // Catch: java.lang.Throwable -> La3
            r313 = r0
            r0 = r313
            if (r0 == 0) goto L77
            r0 = r312
            r1 = r309
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Throwable -> La3
            r306 = r0
            java.lang.String r0 = "%s session data obtained"
            r308 = r0
            r0 = r302
            r1 = r305
            r2 = r308
            X.0fH.A0h(r0, r1, r2)     // Catch: java.lang.Throwable -> La3
            goto L94
        L77:
            java.lang.String r0 = "%s content provider has no session entry."
            r306 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> La3
            r1 = r0
            r2 = 0
            r3 = r302
            r1[r2] = r3     // Catch: java.lang.Throwable -> La3
            r308 = r0
            r0 = r305
            r1 = r306
            r2 = r308
            X.0fH.A17(r0, r1, r2)     // Catch: java.lang.Throwable -> La3
            r0 = 0
            r309 = r0
            r0 = 0
            r306 = r0
        L94:
            r0 = r312
            if (r0 == 0) goto La0
            r0 = r312
            r0.close()
        La0:
            r0 = r306
            return r0
        La3:
            r308 = move-exception
            r0 = r312
            if (r0 == 0) goto Lb1
            r0 = r312
            r0.close()
        Lb1:
            r0 = r308
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4DT.A01(android.content.ContentResolver, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x006b, code lost:
    
        if ((r308.getCause() instanceof android.os.DeadObjectException) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0324, code lost:
    
        throw r308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x003b, code lost:
    
        if ((r308.getCause() instanceof android.os.DeadObjectException) == false) goto L135;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList A02(android.content.ContentResolver r301, android.content.Context r302, com.facebook.fblibraries.fblogin.SsoSource r303) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4DT.A02(android.content.ContentResolver, android.content.Context, com.facebook.fblibraries.fblogin.SsoSource):java.util.ArrayList");
    }

    public static ArrayList A03(Context context, List list) {
        FirstPartySsoSessionInfo A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SsoSource ssoSource = (SsoSource) it.next();
            int i = ssoSource.A01;
            if (i == 0) {
                Iterator it2 = A02(context.getContentResolver(), context, ssoSource).iterator();
                while (it2.hasNext()) {
                    FirstPartySsoSessionInfo firstPartySsoSessionInfo = (FirstPartySsoSessionInfo) it2.next();
                    if (arrayList.indexOf(firstPartySsoSessionInfo.A08) < 0) {
                        arrayList2.add(firstPartySsoSessionInfo);
                    }
                }
            } else if (i == 1) {
                ArrayList arrayList3 = new ArrayList();
                String str = ssoSource.A03;
                context.checkPermission("android.permission.GET_ACCOUNTS", Process.myPid(), Process.myUid());
                AccountManager accountManager = AccountManager.get(context.getApplicationContext());
                for (Account account : accountManager == null ? new Account[0] : accountManager.getAccountsByType(str)) {
                    if (account != null && (A00 = A00(account, context, ssoSource)) != null) {
                        arrayList3.add(A00);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    FirstPartySsoSessionInfo firstPartySsoSessionInfo2 = (FirstPartySsoSessionInfo) it3.next();
                    if (arrayList.indexOf(firstPartySsoSessionInfo2.A08) < 0) {
                        arrayList2.add(firstPartySsoSessionInfo2);
                    }
                }
            }
        }
        return arrayList2;
    }
}
