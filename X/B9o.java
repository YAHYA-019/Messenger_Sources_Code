package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.messaging.service.model.FetchThreadParams;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import org.json.JSONObject;

/* loaded from: B9o.class */
public final class B9o extends CP4 {
    public static final CallerContext A03 = CallerContext.A0E(B9o.class.toString(), null, null);
    public final C00i A00 = AbH.A0J();
    public final C12114ys A01 = (C12114ys) 1Bi.A03(49420);
    public final 66X A02 = (66X) 1Bi.A03(49958);

    public static void A00(Context context, 2Dp r302, B9o b9o, SettableFuture settableFuture, String str) {
        Throwable th;
        Throwable A0L;
        1OW A0A = 2Cb.A01().A0B().A0A(r302, A03);
        try {
            try {
                try {
                    2EU r0 = (2EU) HH8.A00(A0A);
                    if (r0 == null) {
                        0fH.A0B(B9o.class, "No image reference");
                    } else {
                        OutputStream openOutputStream = context.getContentResolver().openOutputStream(C0A2.A03(str));
                        if (openOutputStream == null) {
                            0fH.A0B(B9o.class, "Failed to open URI shared by MWA, destinationOutputStream is null");
                            A0L = AnonymousClass001.A0Q("Failed to open URI shared by MWA");
                        } else {
                            2EY r02 = (2Ea) r0.A09();
                            if (r02 instanceof 2EY) {
                                r02.A04.compress(Bitmap.CompressFormat.JPEG, 85, openOutputStream);
                                r0.close();
                                openOutputStream.close();
                                0fH.A08(B9o.class, str, "Successfully wrote image file to %s");
                                settableFuture.set(CP4.success(AnonymousClass243.A00().A0W(new C1506AjT(b9o, str))));
                            } else {
                                0fH.A0B(B9o.class, "Image cannot be converted to a bitmap");
                                A0L = AnonymousClass001.A0L("Image cannot be converted to a bitmap");
                            }
                        }
                        settableFuture.setException(A0L);
                    }
                    A0A.AGD();
                } catch (FileNotFoundException e) {
                    0fH.A0N(B9o.class, "Failed to open URI shared by MWA", e, new Object[0]);
                    new RuntimeException(e);
                    throw th;
                } catch (IOException e2) {
                    0fH.A0N(B9o.class, "Failed to write image data to URI shared by MWA", e2, new Object[0]);
                    new RuntimeException(e2);
                    throw th;
                }
            } catch (Throwable th2) {
                0fH.A0N(B9o.class, "Something went wrong when waiting for fetch result", th2, new Object[0]);
                new RuntimeException(th2);
                throw th;
            }
        } catch (Throwable th3) {
            A0A.AGD();
            throw th3;
        }
    }

    public ListenableFuture handleRequest(Context context, Bwy bwy, JSONObject jSONObject, FbUserSession fbUserSession) {
        String str;
        0fH.A0C(B9o.class, "Handling message image request");
        if (jSONObject == null) {
            str = "Fetch message image request payload is null";
        } else {
            String string = jSONObject.getString("thread_id");
            if (TextUtils.isEmpty(string)) {
                str = "No thread id found";
            } else {
                String string2 = jSONObject.getString("message_id");
                if (TextUtils.isEmpty(string2)) {
                    str = "No message id found";
                } else {
                    String string3 = jSONObject.getString("photo_uri");
                    if (TextUtils.isEmpty(string3)) {
                        str = "No destination image uri found";
                    } else {
                        long optLong = jSONObject.optLong("message_timestamp", -1);
                        boolean optBoolean = jSONObject.optBoolean("is_group_thread", false);
                        boolean optBoolean2 = jSONObject.optBoolean("is_e2ee", false);
                        1FX A0j = 4YU.A0j();
                        String string4 = jSONObject.getString("e2ee_image_uri");
                        if (!TextUtils.isEmpty(string4)) {
                            0fH.A0C(B9o.class, "Image uri found, trying to fetch image directly");
                            A00(context, 2IA.A01(C0A2.A03(string4)).A04(), this, A0j, string3);
                            return A0j;
                        }
                        if (optBoolean2) {
                            0fH.A0C(B9o.class, "Trying to fetch e2ee image from mailbox api");
                            MailboxFeature mailboxFeature = new MailboxFeature((1Uj) 1Lo.A04(context, fbUserSession, (1BY) null, 16686));
                            try {
                                long parseLong = Long.parseLong(string2);
                                1Um A0O = 1BK.A0O(mailboxFeature, 0);
                                MailboxFutureImpl A0P = 1BK.A0P(A0O);
                                1Um.A02(A0O, Czf.A00(mailboxFeature, A0P, 40, parseLong), A0P, false);
                                A0P.addResultCallback(new Cy2(context, this, A0j, string3, 3));
                                return A0j;
                            } catch (NumberFormatException e) {
                                A0j.setException(new IllegalArgumentException("Failed to parse message id", e));
                                return A0j;
                            }
                        }
                        ThreadKey A02 = ((CbW) 1Lo.A04(context, fbUserSession, (1BY) null, 83487)).A02(context, string, optBoolean);
                        if (A02 == null) {
                            0fH.A0C(B9o.class, "Thread key cannot be created with thread id, try parsing thread id as thread key");
                            A02 = AbG.A0j(string);
                        }
                        if (A02 != null) {
                            1Kd.A0D(this.A00, new D4O(context, this, A0j, string2, string3), ((C5C) 1Bn.A0E(context, (1BY) null, 84534)).A00(new FetchThreadParams(1He.A04, null, ThreadCriteria.A02.A00(A02), null, 20, 0L, false, false, true, false, false), string2, "fetch_thread", optLong));
                            return A0j;
                        }
                        str = "Thread key is still null after trying to create thread key with thread id or parse thread id directly";
                    }
                }
            }
        }
        0fH.A0B(B9o.class, str);
        return CP4.A01("Invalid request", 7);
    }
}
