package X;

import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;

/* loaded from: Dkx.class */
public final class Dkx extends 2JY implements C23u {
    public Dkx(int i, int[] iArr) {
        super(i, iArr);
    }

    public static 6As A00() {
        return 2tS.A00().newTreeBuilder("CurrencyQuantity", 6As.class, 57213880);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Dkx A01(Dkx dkx) {
        TreeBuilderJNI treeBuilderJNI;
        Tree result;
        if (dkx == 0) {
            return null;
        }
        if (dkx.isValidGraphServicesJNIModel()) {
            result = dkx.reinterpret(Dkx.class, 57213880);
        } else {
            if (!(dkx instanceof Tree) || !((Tree) dkx).isValidGraphServicesJNIModel() || (treeBuilderJNI = (TreeBuilderJNI) 2tS.A00().newTreeBuilder("CurrencyQuantity", 6As.class, 57213880, (Tree) dkx)) == null) {
                return null;
            }
            result = treeBuilderJNI.getResult(Dkx.class, 57213880);
        }
        return (Dkx) result;
    }
}
