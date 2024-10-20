package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.DexStore;
import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import com.facebook.quicksilver.webviewcommon.api.QuicksilverClientControlledMessageEnum;
import com.facebook.quicksilver.webviewcommon.api.WebViewToServiceMessageEnum;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Fq0.class */
public final class Fq0 implements GKe {
    public Messenger A00;
    public GKI A01;
    public final FKJ A02;
    public final E9Z A03;
    public final DNU A04;
    public final Messenger A05;

    public Fq0(E9Z e9z) {
        11T.A0F(e9z, 1);
        this.A03 = e9z;
        this.A02 = new FKJ(this);
        Handler handler = new Handler(Looper.getMainLooper());
        ((DNU) handler).A00 = this;
        this.A04 = handler;
        e9z.addJavascriptInterface(this, "QuicksilverAndroid");
        e9z.A01 = new FqL(this);
        this.A05 = new Messenger(handler);
    }

    public static Bundle A00(JSONObject jSONObject) {
        String A03 = A03(jSONObject);
        Bundle bundle = new Bundle();
        bundle.putString("promiseID", A03);
        return bundle;
    }

    public static Bundle A01(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        bundle.putString("promiseID", A03(jSONObject));
        return bundle;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v4 ??, still in use, count: 4, list:
          (r305v4 ??) from 0x0053: PHI (r305v2 ??) = (r305v1 ??), (r305v4 ??) binds: [B:38:0x004f, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
          (r305v4 ??) from 0x0058: PHI (r305v3 ??) = (r305v2 ??), (r305v4 ??) binds: [B:26:0x0055, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]
          (r305v4 ?? I:java.io.Writer) from 0x002e: INVOKE (r305v4 ?? I:java.io.Writer), (r302v0 ?? I:java.lang.String) VIRTUAL call: java.io.Writer.write(java.lang.String):void A[Catch: all -> 0x003f, IOException -> 0x0063, MD:(java.lang.String):void throws java.io.IOException (c)]
          (r305v4 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) from 0x0043: MOVE (r303v5 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r305v4 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final java.lang.String A02(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v4 ??, still in use, count: 4, list:
          (r305v4 ??) from 0x0053: PHI (r305v2 ??) = (r305v1 ??), (r305v4 ??) binds: [B:38:0x004f, B:24:0x0063] A[DONT_GENERATE, DONT_INLINE]
          (r305v4 ??) from 0x0058: PHI (r305v3 ??) = (r305v2 ??), (r305v4 ??) binds: [B:26:0x0055, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]
          (r305v4 ?? I:java.io.Writer) from 0x002e: INVOKE (r305v4 ?? I:java.io.Writer), (r302v0 ?? I:java.lang.String) VIRTUAL call: java.io.Writer.write(java.lang.String):void A[Catch: all -> 0x003f, IOException -> 0x0063, MD:(java.lang.String):void throws java.io.IOException (c)]
          (r305v4 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) from 0x0043: MOVE (r303v5 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r305v4 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public static final String A03(JSONObject jSONObject) {
        return DKC.A1A("promiseID", jSONObject.getJSONObject("content"));
    }

    public static void A04(BaseBundle baseBundle, String str, JSONObject jSONObject) {
        baseBundle.putString(str, jSONObject.getString(str));
    }

    public static void A05(Fq0 fq0, Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        fq0.A07("javascript_interface_error", sb.toString());
    }

    private final void A06(String str) {
        A0C(str, "Missing or malformed object data", "INVALID_PARAM");
    }

    private final void A07(String str, String str2) {
        Bundle A05 = 1BK.A05();
        A05.putString("logTag", str);
        A05.putString("message", str2);
        A09(A05, WebViewToServiceMessageEnum.A0b);
    }

    public static final boolean A08(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        11T.A0A(obtain);
        obtain.writeValue(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return DKD.A1V(marshall.length, LocationComponentCompassEngine.SENSOR_DELAY_MICROS);
    }

    public final void A09(Bundle bundle, WebViewToServiceMessageEnum webViewToServiceMessageEnum) {
        if (this.A00 != null) {
            Message obtain = Message.obtain();
            Bundle A05 = 1BK.A05();
            A05.putSerializable(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, webViewToServiceMessageEnum);
            if (bundle != null) {
                A05.putParcelable("content", bundle);
            }
            obtain.obj = A05;
            obtain.replyTo = this.A05;
            try {
                Messenger messenger = this.A00;
                if (messenger != null) {
                    messenger.send(obtain);
                }
            } catch (RemoteException e) {
                0fH.A0r("QuicksilverWebViewActivity", "Exception in send message to service", e);
            }
        }
    }

    public final void A0A(EOz eOz, Object obj) {
        E9Z e9z;
        try {
            e9z = this.A03;
            e9z.A08(eOz, obj);
        } catch (ERc unused) {
            A07("send_message_error", e9z.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0B(String str, Object obj) {
        JSONObject length;
        if (str == null || (length = str.length()) == 0) {
            return;
        }
        try {
            E9Z e9z = this.A03;
            JSONObject A12 = AnonymousClass001.A12();
            length = A12;
            try {
                length.put("promiseID", str);
                if (obj != null) {
                    A12.put("data", obj);
                } else {
                    A12.put("data", JSONObject.NULL);
                }
                e9z.A08(EOz.A0K, A12);
            } catch (JSONException unused) {
                e9z.A09(str, "Internal error while trying to resolve the promise.", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
                Exception exc = new Exception();
                ((ERc) exc).logMessage = "Unexpected exception while constructing JSONObject to be dispatched toJavascript: resolvePromise";
                throw exc;
            }
        } catch (ERc unused2) {
            A07("send_message_error", length.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.E9Z] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    public final void A0C(String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        String str4 = str3;
        ?? r0 = str4;
        if (str4 == null) {
            String str5 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
            str3 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
            r0 = str5;
        }
        try {
            r0 = this.A03;
            r0.A09(str, str2, str3);
        } catch (ERc unused) {
            A07("send_message_error", r0.toString());
        }
    }

    @Override // X.GKe
    public void BkK(JSONObject jSONObject) {
        try {
            A09(A01(jSONObject), WebViewToServiceMessageEnum.A03);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onAuthorizeAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void BlR(JSONObject jSONObject) {
        try {
            Bundle A05 = 1BK.A05();
            A05.putInt("data", jSONObject.getInt("content"));
            A09(A05, WebViewToServiceMessageEnum.A0f);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onBeginLoad: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void Bmi(JSONObject jSONObject) {
        try {
            A09(A00(jSONObject), WebViewToServiceMessageEnum.A04);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onCanCreateShortcutAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void Bnf(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            JSONObject A1C = DKG.A1C(jSONObject);
            Bundle A09 = DKG.A09(A03);
            A04(A09, "contextTokenID", A1C);
            A09(A09, WebViewToServiceMessageEnum.A05);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onContextSwitch: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void Bqy(JSONObject jSONObject) {
        try {
            JSONObject A1C = DKG.A1C(jSONObject);
            String string = A1C.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            String string2 = A1C.getString("print");
            if ("error".equals(string)) {
                0fH.A14("QuicksilverAndroid", "Received javascript errors: %s", new Object[]{string2});
            } else {
                0fH.A0g(string2, "QuicksilverAndroid", "Received javascript debug log: %s");
            }
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onConsole: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void Br1(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            String string = DKG.A1C(jSONObject).getString("token");
            Bundle A09 = DKG.A09(A03);
            A09.putString("token", string);
            A09(A09, WebViewToServiceMessageEnum.A07);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onConsumePurchaseAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void BrO(JSONObject jSONObject) {
        try {
            Bundle A00 = A00(jSONObject);
            DKD.A1A(A00, jSONObject, "message");
            A09(A00, WebViewToServiceMessageEnum.A08);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onContextChoose: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void BrR(JSONObject jSONObject) {
        try {
            Bundle A00 = A00(jSONObject);
            DKD.A1A(A00, jSONObject, "message");
            A09(A00, WebViewToServiceMessageEnum.A09);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onContextCreate: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void BrU(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            JSONObject A1C = DKG.A1C(jSONObject);
            Bundle A09 = DKG.A09(A03);
            A04(A09, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A1C);
            A09(A09, WebViewToServiceMessageEnum.A0B);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onContextSwitch: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void Bs0(JSONObject jSONObject) {
        try {
            A09(A00(jSONObject), WebViewToServiceMessageEnum.A0F);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onCreateShortcutAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void Bvy(JSONObject jSONObject) {
        try {
            Bundle A05 = 1BK.A05();
            JSONObject A1G = DKC.A1G("content", jSONObject);
            DKD.A1A(A05, A1G, "content");
            if (A08(A05)) {
                A09(A05, WebViewToServiceMessageEnum.A0g);
                return;
            }
            A05.remove("content");
            String optString = A1G.optString("image");
            A1G.remove("image");
            A1G.put("image", "");
            DKD.A1A(A05, A1G, "content");
            String A02 = A02(4YU.A08(this.A03), optString);
            if (A02 != null) {
                A05.putString("file_path", A02);
                A09(A05, WebViewToServiceMessageEnum.A0g);
            }
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onEndGame: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void By1(JSONObject jSONObject) {
        try {
            A09(A00(jSONObject), WebViewToServiceMessageEnum.A0I);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onFetchCatalogAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void By4(JSONObject jSONObject) {
        try {
            A09(A00(jSONObject), WebViewToServiceMessageEnum.A0A);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onFetchCatalogAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void ByB(JSONObject jSONObject) {
        try {
            A09(A00(jSONObject), WebViewToServiceMessageEnum.A0J);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onFetchPurchasesAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void ByH(JSONObject jSONObject) {
        try {
            A09(A00(jSONObject), WebViewToServiceMessageEnum.A0K);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onFetchSubscribableCatalogAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void BzC(JSONObject jSONObject) {
        try {
            A09(A00(jSONObject), WebViewToServiceMessageEnum.A0L);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onFlushPlayerDataAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C08(JSONObject jSONObject) {
        A09(null, WebViewToServiceMessageEnum.A0h);
        GKI gki = this.A01;
        if (gki != null) {
            gki.C07();
        }
    }

    @Override // X.GKe
    public void C0N(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            try {
                Bundle A09 = DKG.A09(A03);
                JSONObject A1C = DKG.A1C(jSONObject);
                A04(A09, "request", A1C);
                A04(A09, "sdkVersion", A1C);
                String string = A1C.getString("data");
                A09.putString("data", string);
                if (A08(A09)) {
                    A09(A09, WebViewToServiceMessageEnum.A10);
                    return;
                }
                A09.remove("data");
                A09.putString("data", "");
                String A02 = A02(4YU.A08(this.A03), string);
                if (A02 != null) {
                    A09.putString("file_path", A02);
                    A09(A09, WebViewToServiceMessageEnum.A10);
                }
            } catch (JSONException unused) {
                A06(A03);
            }
        } catch (JSONException unused2) {
            A05(this, jSONObject, "Invalid JSON content received by onGenericActionAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C0P(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            try {
                Bundle A09 = DKG.A09(A03);
                JSONObject A1C = DKG.A1C(jSONObject);
                A04(A09, "request", A1C);
                A04(A09, "sdkVersion", A1C);
                String string = A1C.getString("data");
                A09.putString("data", string);
                if (A08(A09)) {
                    A09(A09, WebViewToServiceMessageEnum.A11);
                    return;
                }
                A09.remove("data");
                A09.putString("data", "");
                String A02 = A02(4YU.A08(this.A03), string);
                if (A02 != null) {
                    A09.putString("file_path", A02);
                    A09(A09, WebViewToServiceMessageEnum.A11);
                }
            } catch (JSONException unused) {
                A06(A03);
            }
        } catch (JSONException unused2) {
            A05(this, jSONObject, "Invalid JSON content received by onGenericDialogAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C0T(JSONObject jSONObject) {
        try {
            Bundle A05 = 1BK.A05();
            A05.putString("data", DKC.A1A("content", jSONObject));
            A09(A05, WebViewToServiceMessageEnum.A0O);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onGetClipboardTextAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C0V(JSONObject jSONObject) {
        try {
            A09(A00(jSONObject), WebViewToServiceMessageEnum.A0P);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onGetConnectedPlayersAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C0Z(JSONObject jSONObject) {
        try {
            Bundle A01 = A01(jSONObject);
            A01.putString("placementID", DKC.A1A("placementID", DKG.A1C(jSONObject)));
            A09(A01, WebViewToServiceMessageEnum.A0Q);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onGetInterstitialAdAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C0c(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("content").getJSONArray(PublicKeyStoreImplKt.DEVICE_TO_DEVICE_KEYS_VALUE);
                11T.A0A(jSONArray);
                Bundle A09 = DKG.A09(A03);
                DKD.A1A(A09, jSONArray, PublicKeyStoreImplKt.DEVICE_TO_DEVICE_KEYS_VALUE);
                A09(A09, WebViewToServiceMessageEnum.A0R);
            } catch (JSONException unused) {
                A06(A03);
            }
        } catch (JSONException unused2) {
            A05(this, jSONObject, "Invalid JSON content received by onGetPlayerDataAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C0e(JSONObject jSONObject) {
        try {
            Bundle A01 = A01(jSONObject);
            A01.putString("placementID", DKC.A1A("placementID", DKG.A1C(jSONObject)));
            A09(A01, WebViewToServiceMessageEnum.A0S);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onGetRewardedInterstitialAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C0g(JSONObject jSONObject) {
        try {
            Bundle A01 = A01(jSONObject);
            A01.putString("placementID", DKC.A1A("placementID", DKG.A1C(jSONObject)));
            A09(A01, WebViewToServiceMessageEnum.A0T);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onRewardedVideoAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C0i(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            try {
                Bundle A09 = DKG.A09(A03);
                A04(A09, "requestPayload", DKG.A1C(jSONObject));
                A09(A09, WebViewToServiceMessageEnum.A0U);
            } catch (JSONException unused) {
                A06(A03);
            }
        } catch (JSONException unused2) {
            A05(this, jSONObject, "Invalid JSON content received by onGetSignedPlayerInfoAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C11(JSONObject jSONObject) {
        try {
            A09(A01(jSONObject), WebViewToServiceMessageEnum.A0V);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onLoadAdAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C1i(JSONObject jSONObject) {
        try {
            Bundle A01 = A01(jSONObject);
            A04(A01, "sdkVersion", DKG.A1C(jSONObject));
            A09(A01, WebViewToServiceMessageEnum.A0W);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onInitializeAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C3n(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            String A1A = DKC.A1A("adInstanceID", DKG.A1C(jSONObject));
            Bundle A09 = DKG.A09(A03);
            A09.putString("adInstanceID", A1A);
            A09(A09, WebViewToServiceMessageEnum.A0Y);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onLoadAdAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C3p(JSONObject jSONObject) {
        try {
            Bundle A01 = A01(jSONObject);
            A01.putString("placementID", DKC.A1A("placementID", DKC.A1G("content", jSONObject)));
            String str = "BOTTOM";
            try {
                str = DKC.A1A("bannerPosition", DKC.A1G("content", jSONObject));
            } catch (JSONException unused) {
            }
            A01.putString("bannerPosition", str);
            A09(A01, WebViewToServiceMessageEnum.A0Z);
        } catch (JSONException unused2) {
            A05(this, jSONObject, "Invalid JSON content received by onShowAdAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C5k(JSONObject jSONObject) {
        try {
            Bundle A00 = A00(jSONObject);
            DKD.A1A(A00, jSONObject, "message");
            A09(A00, WebViewToServiceMessageEnum.A0d);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onContextChoose: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void C8V(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            String string = jSONObject.getJSONObject("content").getString("payload");
            Bundle A09 = DKG.A09(A03);
            if (string != null) {
                A09.putString("payload", string);
            }
            A04(A09, "effectID", jSONObject.getJSONObject("content"));
            A09(A09, WebViewToServiceMessageEnum.A0e);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onNavigateToCameraWithEffectAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CBG(JSONObject jSONObject) {
        try {
            A09(A00(jSONObject), WebViewToServiceMessageEnum.A0n);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onPerformHapticFeedbackAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CEO(JSONObject jSONObject) {
        try {
            Bundle A05 = 1BK.A05();
            A05.putInt("data", jSONObject.getInt("content"));
            A09(A05, WebViewToServiceMessageEnum.A0i);
            GKI gki = this.A01;
            if (gki != null) {
                gki.CEN(jSONObject.getInt("content"));
            }
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onProgressLoad: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CEo(JSONObject jSONObject) {
        try {
            JSONObject A1G = DKC.A1G(DexStore.CONFIG_FILENAME, jSONObject.getJSONObject("content"));
            String A03 = A03(jSONObject);
            String string = A1G.getString("productID");
            String str = null;
            if (!A1G.isNull("developerPayload")) {
                try {
                    str = A1G.getString("developerPayload");
                } catch (JSONException unused) {
                }
            }
            Bundle A09 = DKG.A09(A03);
            A09.putString("productID", string);
            if (str != null) {
                A09.putString("developerPayload", str);
            }
            A09(A09, WebViewToServiceMessageEnum.A0o);
        } catch (JSONException unused2) {
            A05(this, jSONObject, "Invalid JSON content received by onPurchaseAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CEu(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            JSONObject A1C = DKG.A1C(jSONObject);
            String string = A1C.getString("productID");
            String str = null;
            if (!A1C.isNull("developerPayload")) {
                try {
                    str = A1C.getString("developerPayload");
                } catch (JSONException unused) {
                }
            }
            Bundle A09 = DKG.A09(A03);
            A09.putString("productID", string);
            if (str != null) {
                A09.putString("developerPayload", str);
            }
            A09(A09, WebViewToServiceMessageEnum.A0p);
        } catch (JSONException unused2) {
            A05(this, jSONObject, "Invalid JSON content received by onPurchaseSubscriptionAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CFC(JSONObject jSONObject) {
        A09(null, WebViewToServiceMessageEnum.A0q);
    }

    @Override // X.GKe
    public void CG0(JSONObject jSONObject) {
        A09(null, WebViewToServiceMessageEnum.A0r);
    }

    @Override // X.GKe
    public void CIt(JSONObject jSONObject) {
        try {
            Bundle A05 = 1BK.A05();
            A05.putInt("data", jSONObject.getInt("content"));
            A09(A05, WebViewToServiceMessageEnum.A0j);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onScore: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CKX(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            try {
                Bundle A09 = DKG.A09(A03);
                JSONObject A1C = DKG.A1C(jSONObject);
                A04(A09, "request", A1C);
                A04(A09, "sdkVersion", A1C);
                String string = A1C.getString("data");
                A09.putString("data", string);
                if (A1C.optBoolean("isSecureShieldRequest", false)) {
                    String str = this.A03.A02;
                    if (str != null) {
                        String host = new URL(str).getHost();
                        C04t c04t = new C04t("shield-apps-.*\\.fbsbx\\.com");
                        11T.A0D(host);
                        if (c04t.A08(host)) {
                            A09.putBoolean("isSecureShieldRequest", true);
                        }
                    }
                }
                if (A08(A09)) {
                    A09(A09, WebViewToServiceMessageEnum.A0t);
                    return;
                }
                A09.remove("data");
                A09.putString("data", "");
                String A02 = A02(4YU.A08(this.A03), string);
                if (A02 != null) {
                    A09.putString("file_path", A02);
                    A09(A09, WebViewToServiceMessageEnum.A0t);
                }
            } catch (JSONException unused) {
                A06(A03);
            }
        } catch (JSONException unused2) {
            A05(this, jSONObject, "Invalid JSON content received by onSendPassThroughAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CKp(JSONObject jSONObject) {
        try {
            Bundle A05 = 1BK.A05();
            A05.putString("data", DKC.A1A("content", jSONObject));
            A09(A05, WebViewToServiceMessageEnum.A0u);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onSetClipboardTextAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CKw(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            try {
                Bundle A09 = DKG.A09(A03);
                DKD.A1A(A09, DKC.A1G("data", jSONObject.getJSONObject("content")), "data");
                A09(A09, WebViewToServiceMessageEnum.A0v);
            } catch (JSONException unused) {
                A06(A03);
            }
        } catch (JSONException unused2) {
            A05(this, jSONObject, "Invalid JSON content received by onSetPlayerDataAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CKz(JSONObject jSONObject) {
        try {
            Bundle A05 = 1BK.A05();
            A05.putString("data", DKC.A1A("content", jSONObject));
            A09(A05, WebViewToServiceMessageEnum.A0w);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onSetSessionData: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CL7(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            JSONObject A1G = DKC.A1G("content", jSONObject);
            Bundle A09 = DKG.A09(A03);
            DKD.A1A(A09, A1G, "content");
            if (A08(A09)) {
                A09(A09, WebViewToServiceMessageEnum.A0x);
                return;
            }
            A09.remove("content");
            String optString = A1G.optString("image");
            A1G.remove("image");
            A1G.put("image", "");
            DKD.A1A(A09, A1G, "content");
            String A02 = A02(4YU.A08(this.A03), optString);
            if (A02 == null) {
                A0C(A03, "Large image sharing failed to save as temp file", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
            } else {
                A09.putString("file_path", A02);
                A09(A09, WebViewToServiceMessageEnum.A0x);
            }
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onShareAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CLO(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            String A1A = DKC.A1A("adInstanceID", DKG.A1C(jSONObject));
            Bundle A09 = DKG.A09(A03);
            A09.putString("adInstanceID", A1A);
            A09(A09, WebViewToServiceMessageEnum.A0z);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onShowAdAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void COK(JSONObject jSONObject) {
        try {
            A09(A00(jSONObject), WebViewToServiceMessageEnum.A0k);
        } catch (JSONException unused) {
            A05(this, jSONObject, "Invalid JSON content received by onSubscribeBotAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void CPf(JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            try {
                Bundle A09 = DKG.A09(A03);
                JSONObject A1C = DKG.A1C(jSONObject);
                A04(A09, "app_id", A1C);
                A04(A09, "payload", A1C);
                A09(A09, WebViewToServiceMessageEnum.A0l);
            } catch (JSONException unused) {
                A06(A03);
            }
        } catch (JSONException unused2) {
            A05(this, jSONObject, "Invalid JSON content received by onSwitchGameAsync: ", AnonymousClass001.A0k());
        }
    }

    @Override // X.GKe
    public void Cce(String str, String str2, JSONObject jSONObject) {
        try {
            String A03 = A03(jSONObject);
            if (A03.length() != 0) {
                A0C(A03, str, str2);
            }
        } catch (JSONException unused) {
        }
    }

    public final void postMessage(String str, String str2) {
        JSONObject A1F;
        String A1A;
        11T.A0F(str, 0);
        try {
            A1F = DKC.A1F(str);
            A1A = DKC.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A1F);
        } catch (JSONException unused) {
            A07("javascript_interface_error", 0Pz.A0W("Invalid JSON received via postMessage: ", str));
            return;
        }
        if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0G, A1A)) {
            C1i(A1F);
            return;
        }
        if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0I, A1A)) {
            BlR(A1F);
            return;
        }
        if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0M, A1A)) {
            CEO(A1F);
            return;
        }
        if (!DKG.A1a(QuicksilverClientControlledMessageEnum.A0P, A1A)) {
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0T, A1A)) {
                CKz(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0N, A1A)) {
                CIt(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0S, A1A)) {
                CKw(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0E, A1A)) {
                C0c(A1F);
                return;
            }
            if (A1A.equals("navigatetocamerawitheffectasync")) {
                C8V(A1F);
                return;
            }
            if (A1A.equals("getinterstitialadasync")) {
                C0Z(A1F);
                return;
            }
            if (A1A.equals("getrewardedvideoasync")) {
                C0g(A1F);
                return;
            }
            if (A1A.equals("getrewardedinterstitialasync")) {
                C0e(A1F);
                return;
            }
            if (A1A.equals("loadadasync")) {
                C3n(A1F);
                return;
            }
            if (A1A.equals("showadasync")) {
                CLO(A1F);
                return;
            }
            if (A1A.equals("loadbanneradasync")) {
                C3p(A1F);
                return;
            }
            if (A1A.equals("hidebanneradasync")) {
                C11(A1F);
                return;
            }
            if (A1A.equals("paymentsfetchcatalogasync")) {
                By1(A1F);
                return;
            }
            if (A1A.equals("paymentsfetchpurchasesasync")) {
                ByB(A1F);
                return;
            }
            if (A1A.equals("paymentsconsumepurchaseasync")) {
                Br1(A1F);
                return;
            }
            if (A1A.equals("paymentspurchaseasync")) {
                CEo(A1F);
                return;
            }
            if (A1A.equals("paymentspurchasesubscriptionasync")) {
                CEu(A1F);
                return;
            }
            if (A1A.equals("paymentsfetchsubscribablecatalogasync")) {
                ByH(A1F);
                return;
            }
            if (A1A.equals("paymentsfetchsubscriptionsasync")) {
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0L, A1A)) {
                C08(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0A, A1A)) {
                BzC(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0D, A1A)) {
                C0V(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0Q, A1A)) {
                CKX(A1F);
                return;
            }
            if (A1A.equals("cancreateshortcutasync")) {
                Bmi(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0U, A1A)) {
                CL7(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0F, A1A)) {
                C0i(A1F);
                return;
            }
            if (A1A.equals("subscribebotasync")) {
                COK(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0K, A1A)) {
                Bvy(A1F);
                return;
            }
            if (A1A.equals("gameswitch")) {
                CPf(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A03, A1A)) {
                BrO(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A05, A1A)) {
                By4(A1F);
                return;
            }
            if (A1A.equals("createshortcutasync")) {
                Bs0(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0J, A1A)) {
                Bqy(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A04, A1A)) {
                BrR(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0H, A1A)) {
                C5k(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A06, A1A)) {
                BrU(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A02, A1A)) {
                Bnf(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0W, A1A)) {
                C0P(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0V, A1A)) {
                C0N(A1F);
                return;
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A08, A1A)) {
                try {
                    String A03 = A03(A1F);
                    try {
                        Bundle A09 = DKG.A09(A03);
                        A04(A09, "effectID", A1F.getJSONObject("content"));
                        A09(A09, WebViewToServiceMessageEnum.A0D);
                        return;
                    } catch (JSONException unused2) {
                        A06(A03);
                        return;
                    }
                } catch (JSONException unused3) {
                    A05(this, A1F, "Invalid JSON content received by onCoplayLoadEffectAsync: ", AnonymousClass001.A0k());
                    return;
                }
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A09, A1A)) {
                try {
                    String A032 = A03(A1F);
                    try {
                        Bundle A092 = DKG.A09(A032);
                        A04(A092, "effectID", A1F.getJSONObject("content"));
                        A09(A092, WebViewToServiceMessageEnum.A0E);
                        return;
                    } catch (JSONException unused4) {
                        A06(A032);
                        return;
                    }
                } catch (JSONException unused5) {
                    A05(this, A1F, "Invalid JSON content received by onCoplayShowEffectAsync: ", AnonymousClass001.A0k());
                    return;
                }
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A07, A1A)) {
                try {
                    A09(A00(A1F), WebViewToServiceMessageEnum.A0C);
                    return;
                } catch (JSONException unused6) {
                    A05(this, A1F, "Invalid JSON content received by onCoplayClearEffectAsync: ", AnonymousClass001.A0k());
                    return;
                }
            }
            if (DKG.A1a(QuicksilverClientControlledMessageEnum.A0O, A1A)) {
                CBG(A1F);
                return;
            }
            if (A1A.equals("registerscreenshotprovider")) {
                CG0(A1F);
                return;
            }
            if (A1A.equals("authorizeasync")) {
                BkK(A1F);
                return;
            }
            if (A1A.equals("setclipboardtextasync")) {
                CKp(A1F);
                return;
            } else if (A1A.equals("getclipboardtextasync")) {
                C0T(A1F);
                return;
            } else if (!A1A.equals("quit")) {
                Cce("Unsupported API", "CLIENT_UNSUPPORTED_OPERATION", A1F);
                return;
            }
            A07("javascript_interface_error", 0Pz.A0W("Invalid JSON received via postMessage: ", str));
            return;
        }
        CFC(A1F);
    }
}
