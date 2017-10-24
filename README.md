# Paxos

# 带很多注释的源代码（未完待续Loading...）

我从 github上fork了一个觉得写得挺不错的源码（虽然有一些BUG，我也修正了）。 代码规范易懂。

我觉得这个源码有助于理解Paxos算法，另外考虑到写文章，文字的表达容易让人误解，而且我不擅长排版。所以干脆show you the code. 我对代码的每处都尽可能地加了注释，准确的说，是把文章写到代码注释里面去了。

我觉得Paxos的任何文章都会让人读起来有歧义（即便是《paxos make simple》），因为理解的人对细节解读认为理所当然。 而不理解的人对任何细节都可能会觉得很不能理解，导致感觉很多资料都的讲解都不全面。 有甚者还自己误导自己，还写文章（比如前几个月的我）

这也是Paxos算法最难的地方。

更恶心的是，在工程实施中， 很多人随意改造（根据业务做修改或者派生），那种可读性有时候更差，因为你没法详细了解他们的业务需求， 所以，更很难知道他们修改的动机。

我是浑浑噩噩看了很多文章，然后相互拼接处一个知识交集。 再回归验证自己的理解···为了不自己误导自己，我还看了几篇源码。

# Paxos

# with many annotated source code (to be continued # Loading...)

I got a nice source from GitHub on fork (though some BUG, I've also fixed it).

Code specification is easy to understand.

I think this source will help to understand Paxos algorithm, in addition to consider writing articles, text expression easily misunderstood, and I'm not good at typesetting. So simply show you the code.

I to code each as much as possible to add notes, precisely, is to write code to go inside.

I think any of Paxos's articles will make people read differently (even Paxos make simple), because the understood person is right to interpret the details.

People who do not understand may feel incomprehensible to any detail, which leads to the feeling that a lot of information is not fully explained.

Some people also mislead themselves and write articles (such as me in the last few months)

This is also the hardest part of the Paxos algorithm.

What's more, in engineering implementation, many people are randomly modified (modified or derived from business), which is sometimes less readable because you can't get a detailed understanding of their business needs,

So it's even harder to know what they're trying to do.

I read a lot of articles is muddle along without any aim, then spliced a knowledge.

Again, to verify my own understanding, and not to mislead myself, I also read a few sources.
