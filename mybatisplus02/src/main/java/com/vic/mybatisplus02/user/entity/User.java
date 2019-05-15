package com.vic.mybatisplus02.user.entity;

    import com.baomidou.mybatisplus.annotation.TableName;
    import java.time.LocalDateTime;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 
    * </p>
*
* @author victor
* @since 2019-05-15
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    @TableName("u_user")
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

            /**
            * 名称
            */
    private String name;

    private String password;

    private String phone;

            /**
            * 1普通用户 2管理员
            */
    private Integer userType;

            /**
            * 状态 1启用 0 停用
            */
    private String status;

            /**
            * 创建时间
            */
    private LocalDateTime gmtCreate;

            /**
            * 修改时间
            */
    private LocalDateTime gmtModified;


}
