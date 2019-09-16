package cn.kaimadata.rn.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shibun
 * @since 2019-09-16
 */
@TableName("t_user")
public class User extends Model<User> {

private static final long serialVersionUID = 1L;

        private String id;
        private String name;
        private Integer age;
        private String password;


    public String getId() {
            return id;
            }

        public void setId(String id) {
            this.id = id;
            }

    public String getName() {
            return name;
            }

        public void setName(String name) {
            this.name = name;
            }

    public Integer getAge() {
            return age;
            }

        public void setAge(Integer age) {
            this.age = age;
            }

    public String getPassword() {
            return password;
            }

        public void setPassword(String password) {
            this.password = password;
            }

@Override
protected Serializable pkVal() {
            return null;
        }

@Override
public String toString() {
        return "User{" +
                ", id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", password=" + password +
        "}";
        }
        }