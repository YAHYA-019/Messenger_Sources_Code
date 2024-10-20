package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.acra.constants.ActionId;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* loaded from: JxS.class */
public final class JxS extends JgV implements MIr {
    public static final String __redex_internal_original_name = "ECPBottomSheetContentFragment";
    public int A00;
    public ContextThemeWrapper A01;
    public TextView A02;
    public RecyclerView A03;
    public Q2i A04;
    public Q36 A05;
    public QWo A06;
    public Q37 A07;
    public QWq A08;
    public ECPHandler A09;
    public ECPPaymentRequest A0A;
    public C3033Jgw A0B;
    public LoggingContext A0C;
    public boolean A0D;
    public boolean A0E;
    public final MutableLiveData A0I = JQx.A0a();
    public final Observer A0N = LR9.A01(this, 26);
    public final Integer[] A0X = {2131956091, 2131956090, 2131956038};
    public final Handler A0F = AnonymousClass001.A07();
    public final Llm A0W = new Llm(this);
    public final View.OnClickListener A0H = LKO.A00(this, 99);
    public final Observer A0M = LR9.A01(this, 25);
    public final Observer A0U = LR9.A01(this, 35);
    public final Observer A0O = LR9.A01(this, 27);
    public final Observer A0T = LR9.A01(this, 34);
    public final Observer A0R = LR9.A01(this, 32);
    public final Observer A0P = LR9.A01(this, 30);
    public final Observer A0K = LR9.A01(this, 22);
    public final Observer A0Q = LR9.A01(this, 31);
    public final Observer A0S = LR9.A01(this, 33);
    public final Observer A0J = LR9.A01(this, 21);
    public final Observer A0L = LR9.A01(this, 23);
    public final View.OnClickListener A0G = LKO.A00(this, 97);
    public final LKi A0V = new LKi(this, 1);
    public final Function2 A0Y = new GBs(this, 4);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r311 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.lifecycle.LiveData A05(android.util.SparseArray r301, X.KOy r302, X.JxS r303, int r304, boolean r305) {
        /*
            X.Ks7 r0 = X.C06014fk.A0A()
            X.ErP r0 = r0.A07
            r306 = r0
            r0 = r303
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r0.A0A
            r307 = r0
            java.lang.String r0 = "ecpPaymentRequest"
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L58
            r0 = r307
            java.lang.String r0 = r0.A0A
            r309 = r0
            r0 = r307
            java.lang.String r0 = r0.A08
            r310 = r0
            r0 = r307
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r0.A05
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lb2
            r0 = r307
            java.lang.String r0 = r0.A00
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L49
            r0 = r307
            java.lang.String r0 = r0.A02
            r311 = r0
            r0 = r311
            if (r0 == 0) goto Lb2
        L49:
            r0 = r303
            com.facebookpay.logging.LoggingContext r0 = r0.A0C
            r312 = r0
            r0 = r312
            if (r0 != 0) goto L61
            java.lang.String r0 = "loggingContext"
            r308 = r0
        L58:
            r0 = r308
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L61:
            r0 = r303
            X.Jgw r0 = r0.A0B
            r307 = r0
            java.lang.String r0 = "ecpViewModel"
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L58
            r0 = r307
            X.Jgs r0 = r0.A1Q
            r1 = r302
            r2 = r305
            com.facebookpay.otc.models.OtcInput r0 = r0.A03(r1, r2)
            r313 = r0
            r0 = r303
            X.Jgw r0 = r0.A0B
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L58
            r0 = r307
            X.Jgs r0 = r0.A1Q
            r307 = r0
            r0 = 1
            r314 = r0
            r0 = r307
            r1 = r302
            r2 = r314
            com.facebookpay.otc.models.OtcInput r0 = r0.A03(r1, r2)
            r315 = r0
            r0 = r306
            r1 = r301
            r2 = r312
            r3 = r313
            r4 = r315
            r5 = r309
            r6 = r310
            r7 = r311
            r8 = r304
            r9 = r314
            androidx.lifecycle.LiveData r0 = r0.A00(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        Lb2:
            java.lang.IllegalStateException r0 = X.1BK.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxS.A05(android.util.SparseArray, X.KOy, X.JxS, int, boolean):androidx.lifecycle.LiveData");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.util.Map A06(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
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
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        if (r308 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A07(X.EnumC3490Mfk r301, X.JxS r302, java.lang.Long r303, java.lang.String r304, java.lang.String r305) {
        /*
            X.Ks7 r0 = X.C06014fk.A0A()
            r306 = r0
            r0 = r306
            X.LZv r0 = r0.A02
            r307 = r0
            r0 = r302
            com.facebookpay.logging.LoggingContext r0 = r0.A0C
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L24
            java.lang.String r0 = "loggingContext"
            r306 = r0
        L1b:
            r0 = r306
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L24:
            r0 = r302
            X.Jgw r0 = r0.A0B
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L36
            java.lang.String r0 = "ecpViewModel"
            r306 = r0
            goto L1b
        L36:
            r0 = r306
            X.Jgs r0 = r0.A1Q
            r306 = r0
            r0 = r306
            X.Kzj r0 = r0.A04()
            r309 = r0
            r0 = r308
            r1 = r305
            java.util.LinkedHashMap r0 = X.JR1.A16(r0, r1)
            r310 = r0
            r0 = r303
            r1 = r310
            X.JR1.A1I(r0, r1)
            r0 = r301
            if (r0 == 0) goto L67
            java.lang.String r0 = "CREDENTIAL_TYPE"
            r306 = r0
            r0 = r310
            r1 = r306
            r2 = r301
            java.lang.Object r0 = r0.put(r1, r2)
        L67:
            java.lang.String r0 = "extra_data"
            r311 = r0
            r0 = r310
            r1 = r311
            java.lang.Object r0 = r0.get(r1)
            r308 = r0
            r0 = r308
            boolean r0 = X.C0B7.A08(r0)
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L8d
            r0 = r308
            java.util.Map r0 = (java.util.Map) r0
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L92
        L8d:
            java.util.LinkedHashMap r0 = X.1BK.A1C()
            r308 = r0
        L92:
            r0 = r309
            r1 = r308
            X.LEL.A08(r0, r1)
            r0 = r307
            r1 = r311
            r2 = r308
            r3 = r304
            r4 = r310
            X.DKH.A1P(r0, r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxS.A07(X.Mfk, X.JxS, java.lang.Long, java.lang.String, java.lang.String):void");
    }

    public static final void A08(EnumC3490Mfk enumC3490Mfk, JxS jxS, Long l, String str, String str2, String str3, Throwable th) {
        String str4 = null;
        LZv lZv = C06014fk.A0A().A02;
        LoggingContext loggingContext = jxS.A0C;
        if (loggingContext == null) {
            11T.A0L("loggingContext");
            throw 0Q8.createAndThrow();
        }
        if (th != null) {
            str4 = F2Q.A01(th);
        }
        LinkedHashMap A1C = 1BK.A1C();
        A1C.put("logging_context", loggingContext);
        if (str3 != null) {
            A1C.put("TARGET_NAME", str3);
        }
        if (str2 != null) {
            A1C.put("VIEW_NAME", str2);
        }
        JR1.A1I(l, A1C);
        A1C.put("CREDENTIAL_TYPE", enumC3490Mfk);
        if (str4 != null) {
            LEL.A0A(str4, "error_message", A1C);
        }
        lZv.BZT(str, GOo.A0k(A1C));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A09(JxS jxS) {
        String str;
        LZv A0b = 7zU.A0b();
        LoggingContext loggingContext = jxS.A0C;
        if (loggingContext != null) {
            C3033Jgw c3033Jgw = jxS.A0B;
            str = "ecpViewModel";
            if (c3033Jgw != null) {
                boolean z = !c3033Jgw.A1Q.A07();
                C3033Jgw c3033Jgw2 = jxS.A0B;
                if (c3033Jgw2 != null) {
                    LZv.A03(AbF.A08(1BK.A08(A0b.A00, "user_click_ecpotc_atomic"), 309), loggingContext, new GAk(DKH.A0t(c3033Jgw2.A1Q), loggingContext, "choose_another_way", 4, z));
                    LZv A0b2 = 7zU.A0b();
                    LoggingContext loggingContext2 = jxS.A0C;
                    if (loggingContext2 != null) {
                        C3033Jgw c3033Jgw3 = jxS.A0B;
                        if (c3033Jgw3 != null) {
                            A0b2.A0U(loggingContext2, "nux_checkout", DKH.A0t(c3033Jgw3.A1Q));
                            Bundle bundle = new Bundle(jxS.requireArguments());
                            Fragment fragment = jxS.mParentFragment;
                            if (fragment == null) {
                                throw 1BK.A0h();
                            }
                            Rf1.A00(bundle, fragment, "content_nux_fragment", true, false);
                            return;
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        str = "loggingContext";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    private final boolean A0A() {
        ECPPaymentRequest eCPPaymentRequest = this.A0A;
        if (eCPPaymentRequest == null) {
            11T.A0L("ecpPaymentRequest");
            throw 0Q8.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return 7zR.A1X(checkoutConfiguration.A07);
        }
        return false;
    }

    public static final boolean A0B(JxS jxS) {
        ECPPaymentRequest eCPPaymentRequest = jxS.A0A;
        if (eCPPaymentRequest == null) {
            11T.A0L("ecpPaymentRequest");
            throw 0Q8.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return 7zR.A1X(checkoutConfiguration.A04);
        }
        return false;
    }

    public static final boolean A0C(JxS jxS) {
        ECPPaymentRequest eCPPaymentRequest = jxS.A0A;
        if (eCPPaymentRequest == null) {
            11T.A0L("ecpPaymentRequest");
            throw 0Q8.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return 7zR.A1X(checkoutConfiguration.A06);
        }
        return false;
    }

    @Override // X.MIr
    public /* synthetic */ boolean Bmr(LoggingContext loggingContext, Integer num) {
        return false;
    }

    @Override // X.MIr
    public void CoJ(ECPHandler eCPHandler) {
        this.A09 = eCPHandler;
        C3033Jgw c3033Jgw = this.A0B;
        if (c3033Jgw != null) {
            c3033Jgw.A0n(eCPHandler);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x0bbb, code lost:
    
        if (X.11T.A0O(r0, true) != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0c41, code lost:
    
        if (X.JR0.A1O() != false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0c5c, code lost:
    
        if (r359 != false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0d33, code lost:
    
        if (X.JR0.A1S(((X.LZr) r0.getValue()).A06(X.C3029Jgs.A00(r0, r0, r0))) == false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0e33, code lost:
    
        if (X.JR0.A1S(((X.LZp) r0.getValue()).A01(X.C3029Jgs.A00(r0, r0, r0))) == false) goto L220;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0db8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0de6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0dfc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0e90  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0ebd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0eee  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0f26  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0fcb A[LOOP:0: B:237:0x0fbd->B:239:0x0fcb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x11b9 A[LOOP:1: B:242:0x11ab->B:244:0x11b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x1242  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x1a04  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x129e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x12b1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x12ea  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x19f8  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0fd5  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0fdd  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x102e  */
    /* JADX WARN: Type inference failed for: r0v1482, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 7118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxS.onCreate(android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Drawable indeterminateDrawable;
        int A02 = 0FI.A02(-682622000);
        ContextThemeWrapper A01 = JgV.A01(this, layoutInflater);
        this.A01 = A01;
        View inflate = layoutInflater.cloneInContext(A01).inflate(2132541877, viewGroup, false);
        View findViewById = inflate.findViewById(2131364265);
        if (findViewById != null) {
            FAF A04 = C06014fk.A04();
            if (this.A01 != null) {
                findViewById.setBackgroundColor(1tG.A05(A04.A01(2), ActionId.APPLY_FINISHED_LIST));
            }
            11T.A0L("viewContext");
            throw 0Q8.createAndThrow();
        }
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(2131366721);
        if (progressBar != null && (indeterminateDrawable = progressBar.getIndeterminateDrawable()) != null) {
            FAF A042 = C06014fk.A04();
            if (this.A01 != null) {
                indeterminateDrawable.setColorFilter(A042.A01(0), PorterDuff.Mode.SRC_IN);
            }
            11T.A0L("viewContext");
            throw 0Q8.createAndThrow();
        }
        TextView A06 = AbF.A06(inflate, 2131365314);
        this.A02 = A06;
        if (A06 != null) {
            A06.setText(this.A0X[this.A00].intValue());
        }
        0FI.A08(1631864635, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        String str;
        int A02 = 0FI.A02(897636820);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        C3033Jgw c3033Jgw = this.A0B;
        if (c3033Jgw != null) {
            C3038Jh1 c3038Jh1 = c3033Jgw.A1R;
            Ksw ksw = c3038Jh1.A01;
            if (ksw != null) {
                MediatorLiveData mediatorLiveData = c3038Jh1.A08;
                LZq lZq = c3038Jh1.A0H;
                str = "productComponent";
                mediatorLiveData.removeSource(lZq.A04(ksw));
                MediatorLiveData mediatorLiveData2 = c3038Jh1.A09;
                Ksw ksw2 = c3038Jh1.A01;
                if (ksw2 != null) {
                    mediatorLiveData2.removeSource(lZq.A04(ksw2));
                }
            }
            C3037Jh0 c3037Jh0 = c3033Jgw.A1U;
            if (c3037Jh0.A00 != null) {
                MediatorLiveData mediatorLiveData3 = c3037Jh0.A06;
                C01i c01i = c3037Jh0.A0E;
                LZp lZp = (LZp) c01i.getValue();
                Ksw ksw3 = c3037Jh0.A00;
                if (ksw3 != null) {
                    mediatorLiveData3.removeSource(lZp.A01(ksw3));
                    MediatorLiveData mediatorLiveData4 = c3037Jh0.A07;
                    LZp lZp2 = (LZp) c01i.getValue();
                    Ksw ksw4 = c3037Jh0.A00;
                    if (ksw4 != null) {
                        mediatorLiveData4.removeSource(lZp2.A01(ksw4));
                    }
                }
                11T.A0L("productComponent");
                throw 0Q8.createAndThrow();
            }
            C3039Jh2 c3039Jh2 = c3033Jgw.A1K;
            if (c3039Jh2.A01 != null) {
                MediatorLiveData mediatorLiveData5 = c3039Jh2.A0A;
                C01i c01i2 = c3039Jh2.A0L;
                LZr lZr = (LZr) c01i2.getValue();
                Ksw ksw5 = c3039Jh2.A01;
                str = "productComponent";
                if (ksw5 != null) {
                    mediatorLiveData5.removeSource(lZr.A06(ksw5));
                    MediatorLiveData mediatorLiveData6 = c3039Jh2.A0B;
                    LZr lZr2 = (LZr) c01i2.getValue();
                    Ksw ksw6 = c3039Jh2.A01;
                    if (ksw6 != null) {
                        mediatorLiveData6.removeSource(lZr2.A06(ksw6));
                    }
                }
            }
            0FI.A08(-2106695977, A02);
            return;
        }
        str = "ecpViewModel";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(342252604);
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        this.A02 = null;
        this.A0F.removeCallbacks(this.A0W);
        0FI.A08(66305698, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r301 = this;
            r0 = -534717005(0xffffffffe020ddb3, float:-4.636647E19)
            r302 = r0
            r0 = r302
            int r0 = X.0FI.A02(r0)
            r303 = r0
            r0 = r301
            r304 = r0
            r0 = r301
            super.onResume()
            r0 = r301
            X.Jgw r0 = r0.A0B
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L27
            java.lang.String r0 = "ecpViewModel"
            r306 = r0
        L1e:
            r0 = r306
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L27:
            r0 = r305
            boolean r0 = r0.A0r()
            r307 = r0
            r0 = r301
            android.view.ContextThemeWrapper r0 = r0.A01
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L41
            java.lang.String r0 = "viewContext"
            r306 = r0
            goto L1e
        L41:
            java.lang.String r0 = "ecpPaymentRequest"
            r306 = r0
            r0 = r301
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r0.A0A
            r305 = r0
            r0 = r307
            if (r0 == 0) goto Lb1
            r0 = r305
            if (r0 == 0) goto L1e
            r0 = r305
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r0.A04
            r305 = r0
            r0 = r305
            X.KOY r0 = r0.A03
            r309 = r0
        L63:
            r0 = r301
            boolean r0 = A0C(r0)
            r310 = r0
            r0 = r301
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r0.A0A
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L1e
            r0 = r305
            boolean r0 = X.LD1.A04(r0)
            r311 = r0
            X.M3L r0 = new X.M3L
            r312 = r0
            r0 = r312
            r1 = r301
            r2 = 40
            r0.<init>(r1, r2)
            X.AKV r0 = new X.AKV
            r313 = r0
            r0 = r313
            r1 = 13
            r2 = r301
            r3 = r307
            r0.<init>(r1, r2, r3)
            r0 = r308
            r1 = r304
            r2 = r309
            r3 = 0
            r4 = 0
            r5 = r312
            r6 = r313
            r7 = r310
            r8 = r311
            X.R49.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -126992053(0xfffffffff86e414b, float:-1.9329546E34)
            r1 = r303
            X.0FI.A08(r0, r1)
            return
        Lb1:
            r0 = r305
            if (r0 == 0) goto L1e
            r0 = r305
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r0.A04
            r305 = r0
            r0 = r305
            X.KOY r0 = r0.A04
            r309 = r0
            goto L63
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxS.onResume():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x02fb, code lost:
    
        X.11T.A0L(r322);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0425, code lost:
    
        r319 = "loggingContext";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0ee9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02fb A[EDGE_INSN: B:54:0x02fb->B:52:0x02fb BREAK  A[LOOP:0: B:27:0x0106->B:50:0x0106], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 3909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JxS.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
