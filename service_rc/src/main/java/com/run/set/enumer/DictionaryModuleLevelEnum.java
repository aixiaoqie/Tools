package com.run.set.enumer;

public enum DictionaryModuleLevelEnum {
	
	MODULE_LEVEL_FIRST((byte)1, "第一级"),
	MODULE_LEVEL_SECOND((byte)2, "第二级"),
	MODULE_LEVEL_THIRD((byte)3, "第三级"),
	MODULE_LEVEL_FOURTH((byte)4, "第四级"),
	MODULE_LEVEL_FIFTH((byte)5, "第五级"),
	MODULE_LEVEL_SIXTH((byte)6, "第六级"),
	
	;
	private String text;
	private Byte code;

	private DictionaryModuleLevelEnum(Byte code, String text) {
		this.text = text;
		this.code = code;
	}

	public static String getText(Byte code) {
		for (DictionaryModuleLevelEnum c : DictionaryModuleLevelEnum.values()) {
			if (c.getCode() == code) {
				return c.text;
			}
		}
		return null;

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Byte getCode() {
		return code;
	}

	public void setCode(Byte code) {
		this.code = code;
	}

}
