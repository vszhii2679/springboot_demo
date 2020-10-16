package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;


import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Proxy(lazy = false)
@Table(name = "user", catalog = "springboot_test")
public class UserInfo {
    /**
     * 如果数据库表中 的字段名称和实体类中的属性名称保持一致的话，可以不需要加@Column注解
     * @GeneratedValue(strategy=GenerationType.IDENTITY)主键生成策略
     * GenerationType.IDENTITY表示针对于mysql中有自增长的数据的生成策略
     * GenerationType.SEQUENCE表示针对于oracle数据中的主键生成策略
     * GenerationType.AUTO是默认的选项，会根据数据库自动选择
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer userId;
    private String name;
    @Column(name = "age")
    private Integer userAge;
}
