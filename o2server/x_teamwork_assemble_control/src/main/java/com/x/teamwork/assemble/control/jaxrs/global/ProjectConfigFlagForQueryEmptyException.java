package com.x.teamwork.assemble.control.jaxrs.global;

import com.x.base.core.project.exception.PromptException;

class ProjectConfigFlagForQueryEmptyException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	ProjectConfigFlagForQueryEmptyException() {
		super("查询的项目配置信息ID为空，无法继续查询数据。" );
	}
}
