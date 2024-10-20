package X;

import com.facebook.fury.context.ReqContextTypeResolver;
import com.facebook.http.internal.tigonengine.TigonHttpClientAdapterImpl;
import com.facebook.tigon.TigonCallbacks;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonRequest;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.apache.http.HttpResponse;

/* renamed from: X.40u, reason: invalid class name */
/* loaded from: 40u.class */
public final class C40u implements TigonCallbacks {
    public final int A00;
    public final C5e8 A01;
    public final String A02;
    public final /* synthetic */ TigonHttpClientAdapterImpl A03;

    public C40u(C5e8 c5e8, TigonHttpClientAdapterImpl tigonHttpClientAdapterImpl, String str, int i) {
        this.A03 = tigonHttpClientAdapterImpl;
        this.A00 = i;
        this.A01 = c5e8;
        if (c5e8 != null) {
            c5e8.Bfi();
        }
        this.A02 = str;
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onBody(ByteBuffer byteBuffer) {
        C40x c40x;
        try {
            TigonHttpClientAdapterImpl tigonHttpClientAdapterImpl = this.A03;
            40C r0 = tigonHttpClientAdapterImpl.mRequestStates;
            int i = this.A00;
            if (r0.A00(i) != null) {
                C40w A00 = tigonHttpClientAdapterImpl.mRequestStates.A00(i);
                if (A00 != null) {
                    synchronized (A00) {
                        c40x = A00.A04;
                    }
                    c40x.A05(byteBuffer);
                    return;
                }
            }
            if (byteBuffer == null) {
                return;
            }
        } catch (Exception unused) {
            if (byteBuffer == null) {
                return;
            }
        } catch (Throwable th) {
            if (byteBuffer != null) {
                ((C21u) this.A03.mTigonService.get()).releaseBodyBuffer(byteBuffer);
            }
            throw th;
        }
        ((C21u) this.A03.mTigonService.get()).releaseBodyBuffer(byteBuffer);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public /* synthetic */ void onBodyExperimental(byte[] bArr) {
        11T.A0F(bArr, 1);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        11T.A0D(wrap);
        onBody(wrap);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onEOM(C42g c42g) {
        TigonHttpClientAdapterImpl tigonHttpClientAdapterImpl = this.A03;
        C40w A00 = tigonHttpClientAdapterImpl.mRequestStates.A00(this.A00);
        if (A00 != null) {
            synchronized (A00) {
                boolean z = false;
                if (A00.A01 == 10) {
                    z = true;
                }
                Preconditions.checkState(z);
                A00.A01 = (byte) 11;
                A00.A06 = c42g;
                byte b = A00.A00;
                if (b == 2) {
                    A00.A04.A03();
                    C40w.A00(tigonHttpClientAdapterImpl, A00, A00.A07, A00.A03);
                } else {
                    if (b == 3) {
                        Throwable th = A00.A08;
                        if (th != null) {
                            A00.A04.A04(th);
                            C40w.A01(tigonHttpClientAdapterImpl, A00, A00.A08, A00.A03);
                        }
                    }
                    A00.A04.A03();
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v0 ??, still in use, count: 3, list:
          (r313v0 ??) from 0x0091: PHI (r313v1 ??) = (r313v0 ??), (r313v2 ??) binds: [B:26:0x008a, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]
          (r313v0 ?? I:java.lang.Throwable) from 0x00e5: INVOKE (r0v31 ?? I:X.40x), (r313v0 ?? I:java.lang.Throwable) VIRTUAL call: X.40x.A04(java.lang.Throwable):void A[Catch: all -> 0x00f2, MD:(java.lang.Throwable):void (m)]
          (r313v0 ?? I:java.lang.Throwable) from 0x00ec: IPUT (r313v0 ?? I:java.lang.Throwable), (r0v7 ?? I:X.40w) A[Catch: all -> 0x00f2] X.40w.A08 java.lang.Throwable
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
    @Override // com.facebook.tigon.TigonCallbacks
    public void onError(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v0 ??, still in use, count: 3, list:
          (r313v0 ??) from 0x0091: PHI (r313v1 ??) = (r313v0 ??), (r313v2 ??) binds: [B:26:0x008a, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]
          (r313v0 ?? I:java.lang.Throwable) from 0x00e5: INVOKE (r0v31 ?? I:X.40x), (r313v0 ?? I:java.lang.Throwable) VIRTUAL call: X.40x.A04(java.lang.Throwable):void A[Catch: all -> 0x00f2, MD:(java.lang.Throwable):void (m)]
          (r313v0 ?? I:java.lang.Throwable) from 0x00ec: IPUT (r313v0 ?? I:java.lang.Throwable), (r0v7 ?? I:X.40w) A[Catch: all -> 0x00f2] X.40w.A08 java.lang.Throwable
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

    @Override // com.facebook.tigon.TigonCallbacks
    public void onFirstByteFlushed(long j) {
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onHeaderBytesReceived(long j, long j2) {
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onLastByteAcked(long j, long j2) {
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onResponse(C42M c42m) {
        boolean z;
        final int i;
        TigonHttpClientAdapterImpl tigonHttpClientAdapterImpl = this.A03;
        final C40w A00 = tigonHttpClientAdapterImpl.mRequestStates.A00(this.A00);
        if (A00 != null) {
            synchronized (A00) {
                z = false;
                if (A00.A00 == 0) {
                    z = true;
                }
            }
            Preconditions.checkState(z);
            final HttpResponse A03 = A00.A03(c42m);
            synchronized (A00) {
                i = A00.A03;
            }
            try {
                ((Executor) tigonHttpClientAdapterImpl.mResponseHandlerExecutor.get()).execute(C0jy.A02(new Runnable() { // from class: X.42T
                    public static final String __redex_internal_original_name = "TigonHttpClientAdapterImpl$ClientCallbacks$1";

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z2;
                        try {
                            C40w c40w = A00;
                            int i2 = i;
                            synchronized (c40w) {
                                boolean z3 = false;
                                if (i2 == c40w.A03) {
                                    z3 = true;
                                }
                                z2 = false;
                                if (z3) {
                                    if (c40w.A01 == 12) {
                                        c40w.A00 = (byte) 3;
                                    }
                                    byte b = c40w.A00;
                                    if (b == 0) {
                                        z2 = true;
                                        c40w.A00 = (byte) 1;
                                    } else if (b != 2 && b != 3) {
                                        throw new IllegalStateException();
                                    }
                                }
                            }
                            if (z2) {
                                Object A02 = c40w.A02(A03);
                                TigonHttpClientAdapterImpl tigonHttpClientAdapterImpl2 = C40u.this.A03;
                                synchronized (c40w) {
                                    if (i2 == c40w.A03) {
                                        c40w.A00 = (byte) 2;
                                        byte b2 = c40w.A01;
                                        if (b2 == 11 || b2 == 12) {
                                            C40w.A00(tigonHttpClientAdapterImpl2, c40w, A02, i2);
                                        } else {
                                            c40w.A07 = A02;
                                            c40w.A08 = null;
                                        }
                                    }
                                }
                            }
                        } catch (IOException e) {
                            A00.A04(C40u.this.A03, e, i);
                        } catch (Exception e2) {
                            TigonHttpClientAdapterImpl tigonHttpClientAdapterImpl3 = C40u.this.A03;
                            if (tigonHttpClientAdapterImpl3.mRethrowGeneralExceptions) {
                                throw e2;
                            }
                            A00.A04(tigonHttpClientAdapterImpl3, e2, i);
                        }
                    }
                }, "TigonHttpClientAdapterImpl_handleResponse", ReqContextTypeResolver.resolveName("tigon_java")));
            } catch (RejectedExecutionException e) {
                A00.A04(tigonHttpClientAdapterImpl, e, i);
            }
        }
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onStarted(TigonRequest tigonRequest) {
        C40w A00 = this.A03.mRequestStates.A00(this.A00);
        if (A00 != null) {
            A00.A06(tigonRequest);
        }
        if (this.A01 != null) {
            tigonRequest.url();
        }
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onUploadProgress(long j, long j2) {
        C5e8 c5e8;
        if (this.A03.mRequestStates.A00(this.A00) == null || (c5e8 = this.A01) == null) {
            return;
        }
        c5e8.CSq(j);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onWillRetry(TigonError tigonError, C42g c42g) {
        C40w A00 = this.A03.mRequestStates.A00(this.A00);
        if (A00 != null) {
            A00.A05(tigonError, c42g);
        }
    }
}
