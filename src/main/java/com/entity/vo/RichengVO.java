package com.entity.vo;

import com.entity.RichengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 日程信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("richeng")
public class RichengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "richeng_name")
    private String richengName;


    /**
     * 日程类型
     */

    @TableField(value = "richeng_types")
    private Integer richengTypes;


    /**
     * 日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "richeng_time")
    private Date richengTime;


    /**
     * 日程详情
     */

    @TableField(value = "kaoqin_content")
    private String kaoqinContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getRichengName() {
        return richengName;
    }


    /**
	 * 获取：标题
	 */

    public void setRichengName(String richengName) {
        this.richengName = richengName;
    }
    /**
	 * 设置：日程类型
	 */
    public Integer getRichengTypes() {
        return richengTypes;
    }


    /**
	 * 获取：日程类型
	 */

    public void setRichengTypes(Integer richengTypes) {
        this.richengTypes = richengTypes;
    }
    /**
	 * 设置：日期
	 */
    public Date getRichengTime() {
        return richengTime;
    }


    /**
	 * 获取：日期
	 */

    public void setRichengTime(Date richengTime) {
        this.richengTime = richengTime;
    }
    /**
	 * 设置：日程详情
	 */
    public String getKaoqinContent() {
        return kaoqinContent;
    }


    /**
	 * 获取：日程详情
	 */

    public void setKaoqinContent(String kaoqinContent) {
        this.kaoqinContent = kaoqinContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
