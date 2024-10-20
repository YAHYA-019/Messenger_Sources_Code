package X;

import com.facebook.graphql.enums.GraphQLLSVerifiedType;

/* renamed from: X.7Zh, reason: invalid class name */
/* loaded from: 7Zh.class */
public abstract class C7Zh {
    public static final GraphQLLSVerifiedType A00(Integer num) {
        int intValue = num.intValue();
        return intValue != 1 ? intValue != 2 ? intValue != 3 ? GraphQLLSVerifiedType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE : GraphQLLSVerifiedType.VERIFIED_FOOTER : GraphQLLSVerifiedType.DEFAULT : GraphQLLSVerifiedType.NOT_VERIFIED;
    }
}
