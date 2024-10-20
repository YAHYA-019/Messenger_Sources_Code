package X;

import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;

/* loaded from: Dkz.class */
public final class Dkz extends 2JY implements C23u, GMJ {
    public Dkz(int i, int[] iArr) {
        super(i, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Dkz A00(Dkz dkz) {
        TreeBuilderJNI treeBuilderJNI;
        Tree result;
        if (dkz == 0) {
            return null;
        }
        if (dkz.isValidGraphServicesJNIModel()) {
            result = dkz.reinterpret(Dkz.class, 1156700751);
        } else {
            String typeName = dkz.getTypeName();
            if (typeName == null || !(dkz instanceof Tree) || !((Tree) dkz).isValidGraphServicesJNIModel() || (treeBuilderJNI = (TreeBuilderJNI) 2tS.A00().newTreeBuilder(typeName, 6As.class, 1156700751, (Tree) dkz)) == null) {
                return null;
            }
            result = treeBuilderJNI.getResult(Dkz.class, 1156700751);
        }
        return (Dkz) result;
    }

    public String AVJ() {
        return A0t(GraphQLStringDefUtil.A00(), "GraphQLPaymentActivityActionIdentifier", -1061837230);
    }
}
