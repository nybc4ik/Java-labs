����   = F
      java/lang/Object <init> ()V	  	 
   com/company/Main Arr [I	      java/lang/System out Ljava/io/PrintStream;  vВыберети метод работы программы тестрование(0) или ручной ввод(1) 
      java/io/PrintStream println (Ljava/lang/String;)V  java/util/Scanner	      in Ljava/io/InputStream;
  "  # (Ljava/io/InputStream;)V
  % & ' nextInt ()I	  ) * + a I - Запуск тестов / com/company/Test
 .  2 Введите данные 4 com/company/Numbers
 3 6  7 ([I)V Code LineNumberTable LocalVariableTable this Lcom/company/Main; main ([Ljava/lang/String;)V args [Ljava/lang/String; console Ljava/util/Scanner; StackMapTable 
SourceFile 	Main.java !       * +             8   /     *� �    9        :        ; <   	 = >  8   �     M�
� � � � Y� � !L+� $� (� (� � ,� � .Y� 0M� � 1� � 3Y� � 5M�    9   .    	  
        &  .  6  9  A  L  :       M ? @    4 A B  C   	 � 9   D    E