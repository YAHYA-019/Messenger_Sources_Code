package X;

import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6p0, reason: invalid class name */
/* loaded from: 6p0.class */
public final class C6p0 {
    public final Context A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A04 = new 1BQ(16511);
    public final C00i A0A = new 1BQ(16385);
    public final C00i A05 = new 1BQ(84991);
    public final C00i A08 = new 1BQ(49965);
    public final C00i A0B = new 1BQ(83633);
    public final C00i A0D = new 1BQ(84393);
    public final C00i A0H = new 1BQ(98487);
    public final C00i A09 = new 1BV(83094);
    public final C00i A0E = new 1BQ(66393);
    public final C00i A03 = new 1BV(148040);
    public final C00i A07 = new 1BV(50069);
    public final C00i A0C = new 1BQ(84419);
    public final C00i A06 = new 1BQ(66351);
    public final C00i A0G = new 1BQ(66227);
    public final Boolean A0F = (Boolean) 1Bn.A0A(83441);

    public C6p0(Context context) {
        this.A00 = context;
        this.A02 = new 1HH(context, 67063);
        this.A01 = new 1HH(context, 84929);
    }

    public static CharSequence A00(Spanned spanned, ClickableSpan clickableSpan) {
        CharSequence charSequence = null;
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        if (spanStart >= 0 && spanEnd >= 0) {
            charSequence = spanned.subSequence(spanStart, spanEnd);
        }
        return charSequence;
    }

    public static void A01(Context context, Uri uri, Message message, C6p0 c6p0, C5id c5id, String str) {
        ThreadKey threadKey;
        if (message == null || (threadKey = message.A0V) == null || !((COy) c6p0.A01.get()).A04(uri, message, threadKey, str)) {
            ((C68t) c6p0.A08.get()).A0F(context, uri, message, c5id);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public boolean A02(
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
}
