package X;

import com.meta.metaai.imagine.creation.impl.data.EmuFlashRepository;

/* loaded from: G8m.class */
public final class G8m extends 0DP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EmuFlashRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G8m(EmuFlashRepository emuFlashRepository, 0DR r303) {
        super(r303);
        this.this$0 = emuFlashRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.A00(null, this);
    }
}
