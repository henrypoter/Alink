package com.alibaba.alink.params.classification;

import com.alibaba.alink.params.mapper.RichModelMapperParams;
import com.alibaba.alink.params.shared.HasNumThreads;
import com.alibaba.alink.params.shared.colname.HasVectorColDefaultAsNull;

public interface GbdtPredictParams<T> extends
	RichModelMapperParams <T>,
	HasVectorColDefaultAsNull <T>, HasNumThreads <T> {
}
