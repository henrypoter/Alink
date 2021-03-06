package com.alibaba.alink.params.associationrule;

import com.alibaba.alink.params.shared.associationrules.HasItemsCol;
import com.alibaba.alink.params.shared.associationrules.HasMaxPatternLengthDefaultAs10;
import com.alibaba.alink.params.shared.associationrules.HasMinConfidenceDefaultAs005;
import com.alibaba.alink.params.shared.associationrules.HasMinSupportCountDefaultAsNeg1;
import com.alibaba.alink.params.shared.associationrules.HasMinSupportPercentDefaultAs002;

public interface PrefixSpanParams<T> extends
	HasItemsCol <T>, HasMinSupportCountDefaultAsNeg1 <T>, HasMinSupportPercentDefaultAs002 <T>,
	HasMinConfidenceDefaultAs005 <T>, HasMaxPatternLengthDefaultAs10 <T> {
}
