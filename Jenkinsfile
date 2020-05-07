node{
stage ('SCM Checkout')
{
git 'https://github.com/sathya15992/MyApp'
echo 'checkout completed'
}
stage ('Build Package')
{
sh 'mvn clean package'
}
}
