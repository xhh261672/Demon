#include <iostream>
#include <cstring>
#include <cstdio>
#include "singleton/single.cpp"
using namespace std;

#define OFFSETOF (type, field) ((size_t) &((type*)0)->field)
void f(char *a)
{
    cout<<a<<endl;
    cout<<sizeof(a)<<" "<<strlen(a)<<endl;
}

typedef struct A{
    unsigned char status;
    unsigned long value;
}aa;

class Singleton2
{
private:
    Singleton2()
    {
        a = 1;
    }
    static Singleton2 *instance;
    int a;
    class GC
    {
    public:
        ~GC()
        {
            if (Singleton2::instance)
                delete Singleton2::instance;
        }
    };
    static GC gc;
public:
    static Singleton2 *newInstance()
    {
        if (instance == NULL)
        {
            instance = new Singleton2();
        }
        return instance;
    }
    int getA()
    {
        return this->a;
    }
};

int main()
{
    //char p[] = "hello";
    //int a[] = {1,2,3,4,5};
    //cout << sizeof(a) << endl;
    //cout<<(*a++)<<endl;
    //printf("%d", a++);
    //f(p);

    //size_t o1 = OFFSETOF(aa, status);

//    Singleton2 *s = Singleton2::newInstance();
//    cout<<s->getA()<<endl;
    CSingleton *cs = CSingleton::GetInstance();
    return 0;
}

class Singleton
{
private:
    Singleton(){}
public:
    static Singleton *newInstance()
    {
        static Singleton instance;
        return &instance;
    }
};


