# domain
自定义starter，控制bean优先级

借助InstantiationAwareBeanPostProcessorAdapter在 bean 实例化之前被创建的特点，结合BeanFactory来手动触发目标 bean 的创建
最后通过@Import注解让我们的BeanPostProcessorAdapter生效

参考https://cloud.tencent.com/developer/article/1602061

